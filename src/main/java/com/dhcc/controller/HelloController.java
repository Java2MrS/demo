package com.dhcc.controller;

import com.dhcc.util.BaseClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  demo
 *  com.dhcc.controller
 *  @author:ShenTai
 *  @date: 2017/9/8  8:41
 */
//@RestController
@Controller
public class HelloController extends BaseClass{

    @RequestMapping("/hello")
    public String index(ModelMap map){
        logger.debug("this is HelloController-->debug Message");
        logger.error("this is HelloController-->error Message");
        logger.error(new ClassNotFoundException());
        logger.info("this is HelloController-->info Message");
        //替换前端页面上的默认值
        map.addAttribute("host","http://www.baidu.com");
        System.out.println("map = " + map);
        return "index";
    }
}
