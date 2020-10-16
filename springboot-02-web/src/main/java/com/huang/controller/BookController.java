package com.huang.controller;

import com.huang.mapper.BookMapper;
import com.huang.pojo.Book;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation("获取所有书")
    @GetMapping("/book/get")
    public List<Book> getBooks(){
       return bookMapper.getAllBooks();
    }
}
