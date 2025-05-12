package com.demo.mapper;

import com.demo.MainTest;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CategoryMapperTest extends MainTest {

    @Resource
    private CategoryMapper categoryMapper;

    @org.junit.jupiter.api.Test
    void getCategoryList() {
        categoryMapper.getCategoryList().forEach(System.out::println);
    }
}