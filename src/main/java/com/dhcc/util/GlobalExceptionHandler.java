package com.dhcc.util;

import com.dhcc.resultBean.ErrorInfo;
import com.dhcc.resultBean.MyException;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 *  异常处理类
 *  demo
 *  com.dhcc.util
 *  @author:ShenTai
 *  @date: 2017/9/19  15:13
 */
@ControllerAdvice
public class GlobalExceptionHandler extends BaseClass{
    public static final String DEFAULT_ERROR_VIEW = "error";
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request,Exception e)throws Exception{
        logger.info("进入exception异常");
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception",e);
        mav.addObject("url",request.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
    @ExceptionHandler(value = ClassNotFoundException.class)
    public ModelAndView classNotFound(HttpServletRequest request,ClassNotFoundException e)throws ClassNotFoundException{
        logger.info("进入classnotfound异常");
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception",e);
        mav.addObject("url",request.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonError(HttpServletRequest request,Exception e)throws Exception{
        logger.info("返回JSON格式异常");
        ErrorInfo<String> errorInfo = new ErrorInfo<String>();
        errorInfo.setMessage(e.getMessage());
        errorInfo.setCode(ErrorInfo.ERROR);
        errorInfo.setData("这里写点啥");
        errorInfo.setUrl(request.getRequestURL().toString());
        return errorInfo;
    }
}
