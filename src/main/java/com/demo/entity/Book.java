package com.demo.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 图书
 */
@Data
public class Book {
    /**图书ID*/
    private int bookId;
    /**图书名称*/
    private String bookName;
    /**图书作者*/
    private String authorName;
    /**图书价格*/
    private double price;
    /**分类ID*/
    private int categoryId;
    /**创建时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /**是否上架(1:上架，0:下架)*/
    private String status;
    /**图书主图地址*/
    private String bookUrl;
    /**真实地址*/
    private String bookAddress;
    /**分类名称*/
    private String categoryName;
    /**修改时间*/
    private Date updateTime;
}
