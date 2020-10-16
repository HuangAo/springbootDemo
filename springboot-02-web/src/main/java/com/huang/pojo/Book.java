package com.huang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :huangao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private int bookID;
    private String bookName;
    private int bookCount;
    private String detail;

}
