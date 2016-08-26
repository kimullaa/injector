package com.example.exception;

import org.springframework.context.MessageSource;

import java.util.Locale;

public class BusinessException extends RuntimeException {
    private static MessageSource ms;
    private ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
        super(ms.getMessage(errorCode.code(), null, Locale.getDefault()));
        this.errorCode = errorCode;
    }

    public static void setMessageSource(MessageSource ms){
        BusinessException.ms = ms;
    }

}
