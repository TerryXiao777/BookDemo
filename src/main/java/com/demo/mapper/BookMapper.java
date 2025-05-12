package com.demo.mapper;

import com.demo.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface BookMapper {

    /**
     * 新增图书
     * @param book
     */
    void saveBook(Book book);

    /**
     * 更新图书
     * @param book
     */
    void updateBook(Book book);

    void deleteBookById(int bookId);

    void batchDeleteBook(List<Integer> bookIds);

    /**
     * 查询图书(多条件)
     * @return List
     */
    List<Book> selectBooksByParams(@Param("bookName") String bookName, @Param("categoryId") Integer categoryId,
                                   @Param("status") String status, @Param("start") Date start, @Param("end") Date end);
}
