package com.dhcc.service;

/**
 *  demo
 *  com.dhcc.service
 *  @author:ShenTai
 *  @date: 2017/9/20  17:14
 */
public interface RedisService {

    public void set(String key, Object value);

    public Object get(String key);
}
