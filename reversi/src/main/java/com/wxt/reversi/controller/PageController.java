package com.wxt.reversi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/index")
    public String index(){
        return "/index";
    }

    @RequestMapping("/test")
    public String test(){
        return "/test";
    }
}
