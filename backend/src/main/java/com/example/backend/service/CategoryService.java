package com.example.backend.service;
import com.example.backend.dto.CategoryDto;
import com.example.backend.mapper.CategoryMapper;
import com.example.backend.model.Category;
import com.example.backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryMapper categoryMapper;

    public List<CategoryDto> getList(){
        List<CategoryDto> categoryDtoList = new ArrayList<>();
        List<Category> categoryList = categoryRepository.findAll();
        for ( Category category : categoryList){
            CategoryDto categoryDto = categoryMapper.toCategoryDto(category);
            categoryDtoList.add(categoryDto);
        }
        return categoryDtoList;
    }
    public String postCategory(CategoryDto categoryDto){
        Category category = categoryRepository.findByName(categoryDto.getNameCategory());
        String test;
        if(category != null){
            test = "Đã tồn tại bản ghi";
        }
        else {
            Category post = categoryMapper.toCategory(categoryDto);
            categoryRepository.save(post);
            test ="Thêm thành công";
        }
        return test;
    }
}
