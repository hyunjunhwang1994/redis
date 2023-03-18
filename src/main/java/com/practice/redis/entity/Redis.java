package com.practice.redis.entity;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;


@RedisHash(value = "entity")
@NoArgsConstructor
public class Redis {

    @Id
    private String userId;

    private String name;

    @TimeToLive
    private Long ttl;


    public Redis(String userId, String name, Long ttl) {
        this.userId = userId;
        this.name = name;
        this.ttl = ttl;
    }
}
