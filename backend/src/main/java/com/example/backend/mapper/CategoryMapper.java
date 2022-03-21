package com.example.backend.mapper;
import com.example.backend.dto.CategoryDto;
import com.example.backend.model.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public CategoryDto toCategoryDto(Category category){
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setNameCategory(category.getNameCategory());
        categoryDto.setImage(category.getImage());
        return categoryDto;
    }
    public Category toCategory(CategoryDto categoryDto){
        Category category = new Category();
        category.setNameCategory(categoryDto.getNameCategory());
        category.setImage(categoryDto.getImage());
        return category;
    }
}
