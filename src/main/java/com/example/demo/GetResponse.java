package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class GetResponse {

    @GetMapping("/getString")
    public String get(){
        System.out.println("访问了一次");
        return "页面展示";
    }
}
