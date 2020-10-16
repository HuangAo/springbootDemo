package com.huang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;


/**
 * @author :huangao
 */
@Controller
public class LoginController {

    @GetMapping("/user/login")
    public String login(String username, String password, Model model, HttpSession session){
        if(StringUtils.equals(username,"huang") && StringUtils.equals(password,"123456")){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","用户名或密码错误");
            //return "redirect:/index.html";
            return "index";
        }

    }
}
