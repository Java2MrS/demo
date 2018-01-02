package com.dhcc.controller;

import com.dhcc.util.BaseClass;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  demo
 *  com.dhcc.controller
 *  @author:ShenTai
 *  @date: 2017/9/19  15:06
 */
@RestController
@RequestMapping("/error")
public class ErrorController extends BaseClass{

    @RequestMapping("/error")
    public String throwError() throws Exception{
        logger.info("进入controller----准备抛出异常");
        throw new Exception("抛出异常");
    }

    @RequestMapping("/classNotFound")
    public String classNotFound() throws ClassNotFoundException{
        logger.info("准备抛出classnotfound异常");
        throw new ClassNotFoundException("找不到类");
    }
}
