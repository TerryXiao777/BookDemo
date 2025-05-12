package com.demo.service;

import com.demo.dto.Page;
import com.demo.entity.Book;
import com.demo.mapper.BookMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;
    public void addBook(Book book){
        book.setCreateTime(new Date());
        bookMapper.saveBook(book);
    }

    public void updateBook(Book book){
        book.setUpdateTime(new Date());
        bookMapper.updateBook(book);
    }

    public void deleteBookByBookId(int bookId){
        bookMapper.deleteBookById(bookId);
    }

    public void batchDeleteBook(List<Integer> bookIds){
        bookMapper.batchDeleteBook(bookIds);
    }

    public Page getBooksPage(int pageNo, int pageSize, String bookName, Integer categoryId, String status, Date start, Date end){
        Page page = new Page();
        PageHelper.startPage(pageNo, pageSize);
        List<Book> bookList = bookMapper.selectBooksByParams(bookName, categoryId, status, start, end);
        PageInfo<Book> bookPageInfo = new PageInfo<>(bookList);
        page.setPage(bookPageInfo.getList());
        page.setPageNo(bookPageInfo.getPageNum());
        page.setPageSize(bookPageInfo.getPageSize());
        page.setHasNext(bookPageInfo.isHasNextPage());
        page.setHasPre(bookPageInfo.isHasPreviousPage());
        page.setPageCount(bookPageInfo.getPages());
        page.setTotal(bookPageInfo.getTotal());
        return page;
    }
}
