package com.dhcc.resultBean;

/**
 *
 *  定义接口返回异常的类
 *  demo
 *  com.dhcc.resultBean
 *  @author:ShenTai
 *  @date: 2017/9/19  16:31
 */
public class ErrorInfo<T> {

    public static final Integer OK = 200;
    public static final Integer ERROR = 400;

    private Integer code ;
    private String message;
    private String url;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
