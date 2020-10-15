package com.huang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :huangao
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot..";
    }
}
