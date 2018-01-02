package com.dhcc.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *  BaseClass 基类，用来封装通用的方法，继承此类即可使用。
 *  demo
 *  com.dhcc.util
 *  @author:ShenTai
 *  @date: 2017/9/19  10:05
 */
public class BaseClass {
    protected Logger logger =null ;
    public BaseClass(){
        logger=LogManager.getLogger(getClass().getName());
    }
}
