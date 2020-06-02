package com.study.springbootmybatis.config.service;

/**
 * 全局捕获异常实体类
 */
public class ErrorResponseEntity {

    private int code;
    private String message;
    // 省略 get set

    public ErrorResponseEntity() {
        super();
    }

    public ErrorResponseEntity(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
