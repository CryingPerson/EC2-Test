package com.myspace.ec2test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WebController {

    @GetMapping("api/v1")
    public Map<String, String> chech(){

        return Map.of("hello", "world");
    }
}
