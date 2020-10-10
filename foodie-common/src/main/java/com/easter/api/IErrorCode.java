package com.easter.api;

/**
 * @Author EasterFan working on 2020/10/10 11:45 上午
 * @Description 封装API的错误码
 * @Version 1.0
 */

public interface IErrorCode {
    long getCode();

    String getMessage();
}
