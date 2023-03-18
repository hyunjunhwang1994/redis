package com.practice.redis.controller;


import com.practice.redis.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
@RequiredArgsConstructor
public class RedisController {

    private final RedisService redisService;

    @GetMapping("/template")
    public void redisTemplate() {

        redisService.redisTemplate();

    }

    @GetMapping("/repository")
    public void redisRepository() {
        redisService.redisRepository();
    }


}
