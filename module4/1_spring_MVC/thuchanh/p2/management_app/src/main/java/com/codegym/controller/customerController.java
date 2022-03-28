package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class customerController {
    @GetMapping("/customers")
    public String showlist(){
        return "customers/list.jsp";
    }
}
