package com.dhcc.controller;

import com.dhcc.resultBean.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  demo
 *  com.dhcc.controller
 *  @author:ShenTai
 *  @date: 2017/9/19  16:35
 */
@RestController
@RequestMapping("/JSON_error")
public class ApiErrorController {
    @RequestMapping("/json")
    public String getJsonError() throws Exception{
        throw new MyException("发生异常");
    }
}
