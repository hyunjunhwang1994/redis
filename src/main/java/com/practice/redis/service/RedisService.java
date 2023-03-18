package com.practice.redis.service;


import com.practice.redis.entity.Redis;
import com.practice.redis.repository.RedisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class RedisService {


    @Autowired
    @Qualifier("defaultTemplate")
    RedisTemplate<String, Object> redisTemplate;

    private final RedisRepository repository;

    private StopWatch stopWatch = new StopWatch("hyunjun");



    public void redisTemplate() {

        stopWatch.start("redisTemplate");

        HashOperations<String, Object, Object> hashOperations = redisTemplate.opsForHash();
        hashOperations.put("userId", "name", "HongGilDong");
        hashOperations.put("userId", "age", "20");

        redisTemplate.expire("userId", 120, TimeUnit.SECONDS);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());

    }

    public void redisRepository() {
        stopWatch.start("redisRepository");
        Redis redis = new Redis("gildong2", "HongGilDong", 120L);
        repository.save(redis);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

}
