package com.quietlip.carol_shop.api.exception;


import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {
    private final Throwable throwable;
    private final String msg;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timestamp;

    public ApiException(Throwable t, String msg, HttpStatus httpStatus, ZonedDateTime timestamp){
        throwable = t;
        this.msg = msg;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMsg() {
        return msg;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public Throwable getThrowable() {
        return throwable;
    }
}
