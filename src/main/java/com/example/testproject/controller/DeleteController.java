package com.example.testproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-api")
public class DeleteController {
    //http://localhost:8080/api/v1/get-api/variable1/{String값}
    @DeleteMapping(value = "/delete/{variable}")
    public String DeleteVariable(@PathVariable String variable){return variable;}
}
