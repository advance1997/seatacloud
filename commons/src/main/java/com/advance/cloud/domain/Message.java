package com.advance.cloud.domain;

/**
 * 消息枚举
 */
public enum Message {

    SUCCESS(0 , "请求成功！"),
    ERROR(500, "请求出错！"),
    FAILED(400, "请求失败！");

    Message(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    private Integer code;

    public Integer getCode(){
        return this.code;
    }

    private String msg;

    public String getMsg(){
        return this.msg;
    }

}
