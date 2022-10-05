package com.quietlip.carol_shop.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class YahooAPIResponse {
    private String chartName;
    private String disclaimer;
    private Object bpi;
    private Object time;
}
