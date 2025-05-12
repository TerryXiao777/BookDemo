package com.demo.controller;

import com.demo.dto.ResponseMsg;
import com.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/getCategoryList")
    public ResponseMsg getCategoryList(){
        return ResponseMsg.ok(categoryService.getAllCategory());
    }
}
