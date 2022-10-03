package com.quietlip.carol_shop.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class YahooAPIResponse {
    private Object[] data;
    private String message;
    private int status;
}
