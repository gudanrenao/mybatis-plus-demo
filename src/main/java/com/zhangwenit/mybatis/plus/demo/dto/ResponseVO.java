package com.zhangwenit.mybatis.plus.demo.dto;

import java.io.Serializable;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/5/15 11:46 PM
 * @Version 1.0
 **/
public class ResponseVO<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int errCode;
    private String errMsg;

    private T data;

    public static <T> ResponseVO<T> buildSuccess() {
        return buildSuccess(null);
    }

    public static <T> ResponseVO<T> buildSuccess(T data) {
        return new ResponseVO<>(0, "success", data);
    }

    public ResponseVO() {
    }

    public ResponseVO(int errCode, String errMsg, T data) {
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.data = data;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}