package com.practice.redis.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @GetMapping("/template")
    public void redisTemplate() {

    }

    @GetMapping("/repository")
    public void redisRepository() {

    }


}
