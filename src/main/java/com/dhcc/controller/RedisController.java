package com.dhcc.controller;

import com.alibaba.fastjson.JSON;
import com.dhcc.entity.RedisUser;
import com.dhcc.service.RedisService;
import com.dhcc.util.BaseClass;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 *  demo
 *  com.dhcc.controller
 *  @author:ShenTai
 *  @date: 2017/9/20  17:16
 */
@Controller
@RequestMapping("/redis")
public class RedisController extends BaseClass{

    @Resource
    private RedisService redisService;

    //从redis获取某个用户
    @RequestMapping("/getValue")
    @ResponseBody
    public RedisUser getRedis(@RequestParam String key) {
        logger.info("key--->"+key);
        RedisUser redisUser = null;
        try {
            redisUser = (RedisUser)redisService.get(key);
            System.out.println(JSON.toJSON(redisUser));
        } catch (Exception e) {
            e.printStackTrace();
        }


        return redisUser;
    }

    @RequestMapping("/setValue")
    public String setValue(){
        //System.out.println("测试redis----------进入setValue");
        RedisUser redisUser = new RedisUser();
        redisUser.setId("1");
        redisUser.setName("测试");
        redisService.set("1",redisUser);
        return "/index";
    }
}
