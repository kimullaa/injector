package com.example.exception;

public enum ErrorCode {
    ACCOUNT_LOCKED("a10101"), MUST_CHANGE_PASSWORD("a10102");

    private String code;

    ErrorCode(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

}
