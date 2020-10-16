package com.huang.mapper;

import com.huang.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author :huangao
 */
@Mapper
@Repository
public interface BookMapper {
    List<Book> getAllBooks();
}
