package com.huang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author :huangao
 */
@RestController
public class JdbcTestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/jdbc/get")
    public List<Map<String,Object>> results(){

        String sql = "select * from books";
        return jdbcTemplate.queryForList(sql);
    }
}
