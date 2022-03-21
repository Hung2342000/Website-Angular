package com.example.backend.controller;

import com.example.backend.dto.CategoryDto;
import com.example.backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<CategoryDto> getList(){
        List<CategoryDto> categoryDtoList = categoryService.getList();
        return categoryDtoList;
    }
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public void postCategory(@RequestBody CategoryDto categoryDto){

        categoryService.postCategory(categoryDto);
    }

}
