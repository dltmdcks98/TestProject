package com.example.testproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//컨트롤러로 사용되는것을 알림
public class HelloController {

//    @RequestMapping(value = "/hello" , method = RequestMethod.GET)//메소드 지정 고전 방식
    @GetMapping("hello")
    public  String hello(){
        return "Hello World";
    }
}
