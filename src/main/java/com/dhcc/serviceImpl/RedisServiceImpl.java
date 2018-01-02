package com.dhcc.serviceImpl;

import com.dhcc.service.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *  demo
 *  com.dhcc.serviceImpl
 *  @author:ShenTai
 *  @date: 2017/9/20  17:14
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;


    @Override
    public void set(String key, Object value) {
        System.out.println("------------redis测试数据开始插入---------");
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        vo.set(key, value);
        System.out.println("------------redis测试数据插入完成---------");
    }

    @Override
    public Object get(String key) {
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }
}
