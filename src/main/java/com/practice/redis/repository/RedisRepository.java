package com.practice.redis.repository;

import com.practice.redis.entity.Redis;
import org.springframework.data.repository.CrudRepository;

public interface RedisRepository extends CrudRepository<Redis, String> {

}
