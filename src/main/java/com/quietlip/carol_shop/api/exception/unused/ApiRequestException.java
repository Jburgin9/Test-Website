package com.quietlip.carol_shop.api.exception.unused;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiRequestException extends RuntimeException{
    public ApiRequestException(String msg){
        super(msg);
    }

    public ApiRequestException(Throwable t, String msg){
        super(msg, t);
    }
}
