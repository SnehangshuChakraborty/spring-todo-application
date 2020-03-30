package com.in28minuteProjects.springtodoapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginModule {

    @RequestMapping("/login")
    @ResponseBody
    private String loginModule(){
        return "Hey There Snehangshu!";
    }

    @RequestMapping("/login-bean")
    @ResponseBody
    private LoginModuleBean loginModuleBean(){
        return new LoginModuleBean("Hey there Snehangshu, This is the bean you tried accessing");
    }
}
