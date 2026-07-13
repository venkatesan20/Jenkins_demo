package com.example.jenkinsdemo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class democlass {

    @GetMapping("/demo")
    public String getdemo(){
        return "hello lenkins I am learning you ";
    }





}
