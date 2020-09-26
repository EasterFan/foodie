package com.easter.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Author EasterFan working on 2020/9/26 11:41 下午
 * @Description
 * @Version 1.0
 */
@Data
@AllArgsConstructor(staticName = "of")
public class ErrorResponse {
    private String errorCode;
    private String errorMessage;
    private List<FieldError> filedErrors;

    @Data
    @AllArgsConstructor(staticName = "of")
    public static class FieldError {
        private String path;
        private String message;
    }
}
