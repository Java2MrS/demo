package com.dhcc.entity;

import java.io.Serializable;

/**
 *  demo
 *  com.dhcc.entity
 *  @author:ShenTai
 *  @date: 2017/9/20  17:33
 */
public class RedisUser implements Serializable{
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
