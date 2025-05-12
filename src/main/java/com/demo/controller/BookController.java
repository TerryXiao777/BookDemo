package com.demo.controller;

import com.demo.dto.ResponseMsg;
import com.demo.entity.Book;
import com.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(value = "/addBook")
    public ResponseMsg addBook(@RequestBody Book book){
        bookService.addBook(book);
        return ResponseMsg.ok();
    }

    @PostMapping(value = "/updateBook")
    public ResponseMsg updateBook(@RequestBody Book book){
        bookService.updateBook(book);
        return ResponseMsg.ok();
    }

    @PostMapping(value = "/batchDeleteBook")
    public ResponseMsg batchDeleteBook(@RequestBody List<Integer> bookIds){
        bookService.batchDeleteBook(bookIds);
        return ResponseMsg.ok();
    }

    @DeleteMapping(value = "/deleteBook")
    public ResponseMsg deleteBook(int bookId){
        bookService.deleteBookByBookId(bookId);
        return ResponseMsg.ok();
    }

    @GetMapping(value = "/queryBooksPage")
    public ResponseMsg queryBooksPage(@RequestParam(value = "pageNo") int pageNo,
                                      @RequestParam(value = "pageSize") int pageSize,
                                      String bookName, Integer categoryId, String status,
                                      @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date start,
                                      @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date end){
        return ResponseMsg.ok(bookService.getBooksPage(pageNo, pageSize,bookName, categoryId, status, start, end));
    }
}
