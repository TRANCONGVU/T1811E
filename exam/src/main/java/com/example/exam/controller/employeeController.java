package com.example.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class employeeController {
    @GetMapping("/")
    public String List(){
        return "employees";
    }
}
