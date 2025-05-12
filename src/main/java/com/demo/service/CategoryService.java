package com.demo.service;

import com.demo.entity.Category;
import com.demo.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> getAllCategory(){
        return categoryMapper.getCategoryList();
    }
}
