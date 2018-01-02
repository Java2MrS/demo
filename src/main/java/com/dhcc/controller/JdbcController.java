package com.dhcc.controller;

import com.dhcc.entity.ObdDrivers;
import com.dhcc.service.ObdDriverService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 *  demo
 *  com.dhcc.controller
 *  @author:ShenTai
 *  @date: 2017/9/15  17:30
 */

@RestController
@RequestMapping("/ObdDriver")
public class JdbcController {
    @Resource
    private ObdDriverService obdDriverService;


    @RequestMapping("/getDriver")
    public ObdDrivers getDrivers(){
        System.out.println("---controller---");
        return obdDriverService.selectByPrimaryKey(Long.valueOf(15));
    }


}
