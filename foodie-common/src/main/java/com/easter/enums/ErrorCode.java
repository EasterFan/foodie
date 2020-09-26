package com.easter.enums;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

/**
 * @Author EasterFan working on 2020/9/27 12:03 上午
 * @Description
 * @Version 1.0
 */
@Getter
@ToString
public enum ErrorCode {
    /**
     * 错误码
     */
    USER_ALREADY_EXIST(1001, HttpStatus.BAD_REQUEST, "当前用户已经存在"),
    FULL_NAME_ALREADY_EXIST(1002, HttpStatus.BAD_REQUEST, "当前用户已经存在"),
    PASSWORD_MISMATCH_CURRENT_USER(1011, HttpStatus.BAD_REQUEST, "旧密码输入错误");

    private final int code;

    private final HttpStatus status;

    private final String message;

    ErrorCode(int code, HttpStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }
}
