package com.easter.exception;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import lombok.var;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.security.NoSuchAlgorithmException;

import static org.springframework.core.annotation.AnnotatedElementUtils.findMergedAnnotation;

/**
 * @Author EasterFan working on 2020/9/26 11:38 下午
 * @Description
 * @Version 1.0
 */
@Slf4j
@ControllerAdvice("com.easter.controller")
public class GlobalExceptionHandle {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException ex) {
        log.error("NotFoundException:", ex);
        var httpStatus = resolveAnnotatedResponseStatus(ex, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(ErrorResponse.of(getCode(httpStatus), ex.getMessage(), null), httpStatus);
    }

    @ExceptionHandler(UserAlreadyExistException.class)
    public ResponseEntity<ErrorResponse> handleUserAlreadyExistException(UserAlreadyExistException ex) {
        log.error("UserAlreadyExistException:", ex);
        var httpStatus = resolveAnnotatedResponseStatus(ex, HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(ErrorResponse.of(String.valueOf(ErrorCode.USER_ALREADY_EXIST), ex.getMessage(), null), httpStatus);
    }

    @ExceptionHandler(NoSuchAlgorithmException.class)
    public ResponseEntity<ErrorResponse> handleNoSuchAlgorithmException(NoSuchAlgorithmException ex) {
        log.error("NoSuchAlgorithmException:", ex);
        var httpStatus = resolveAnnotatedResponseStatus(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(ErrorResponse.of(getCode(httpStatus), ex.getMessage(), null), httpStatus);
    }

    private HttpStatus resolveAnnotatedResponseStatus(Exception exception, HttpStatus defaultHttpStatus) {
        val annotation = findMergedAnnotation(exception.getClass(), ResponseStatus.class);
        if (annotation != null) {
            return annotation.value();
        }
        return defaultHttpStatus;
    }

    private String getCode(HttpStatus httpStatus) {
        return String.valueOf(httpStatus.value());
    }
}
