package com.huang.controller;

import com.huang.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :huangao
 */
@RestController
public class StarterController {

    @Autowired
    HelloService helloService;

    @GetMapping("starter/test")
    public String myStarter(){
       return helloService.sayHello("Huang");
    }
}
