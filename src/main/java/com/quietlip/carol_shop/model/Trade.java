package com.quietlip.carol_shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Trade {
    private String symbol;
    private String type;
    private String strike;
    private String expiration;
    private String price;
    private String target;
}
