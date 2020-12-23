package com.spring.server.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class WebController {

    @PostMapping("/test1")
    public String index() {
        return "Hello World";
    }
}
