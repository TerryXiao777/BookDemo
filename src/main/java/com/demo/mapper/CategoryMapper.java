package com.demo.mapper;

import com.demo.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    /**
     * 获取分类列表
     * @return List
     */
    List<Category> getCategoryList();
}
