package com.quietlip.carol_shop;

import com.quietlip.carol_shop.model.Inventory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@SpringBootApplication
public class CarolShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarolShopApplication.class, args);
    }
}
