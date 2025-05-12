package com.demo.dto;

import lombok.Data;

@Data
public class Page {
    /**当前页*/
    private int pageNo;

    /**页大小*/
    private int pageSize;

    /**总页数*/
    private int pageCount;
    /**总记录数*/
    private long total;
    /**是否有下一页*/
    private boolean hasNext;
    /**是否有上一页*/
    private boolean hasPre;

    /**
     * 当前页数据
     */
    protected Object page;
}
