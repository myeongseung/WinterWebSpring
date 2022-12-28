package com.study.springbootwinter202212.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WmainpageController {
    @GetMapping("/mainpage")
    public String loadMainpage() {
        return "/mainpage";
    }
}
