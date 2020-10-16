package com.huang.controller;

import com.huang.mapper.BookMapper;
import com.huang.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author :huangao
 */
@RestController
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @GetMapping("/book/get")
    public List<Book> getBooks(){
       return bookMapper.getAllBooks();
    }
}
