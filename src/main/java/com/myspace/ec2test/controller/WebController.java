package com.myspace.ec2test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class WebController {

    @GetMapping("api/v1")
    public Map<String, String> chech() {
        log.info(" 성공 축하 ");
        log.error(" 실패 실패 ");
        log.warn(" 조심 조심 ");
        return Map.of("hello", "world");
    }
}