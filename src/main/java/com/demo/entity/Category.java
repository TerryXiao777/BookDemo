package com.demo.entity;

import lombok.Data;

/**
 * 图书分类
 */
@Data
public class Category {
    /**分类ID*/
    private int categoryId;
    /**分类名称*/
    private String categoryName;
}
