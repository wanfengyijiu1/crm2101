package com.powernode.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @RequestMapping("/")
    public String Index(){
        return "index";
    }
    @RequestMapping("/test")
    public String hehe(){

        return "first";
    }
    @RequestMapping("/heihei")
    public String haha(){
        return "heihei";
    }
}
