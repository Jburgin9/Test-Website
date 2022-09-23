package com.quietlip.carol_shop.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> RequestExceptionHandler(ApiRequestException requestException){
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        ApiException badApiRequest = new ApiException(requestException.getCause(),
                requestException.getMessage(),
                badRequest,
                ZonedDateTime.now(ZoneId.of("EST - -05:00")));
        return new ResponseEntity<>(badApiRequest, badRequest);
    }
}
