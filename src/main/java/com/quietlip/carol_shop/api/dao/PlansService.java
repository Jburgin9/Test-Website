package com.quietlip.carol_shop.api.dao;

import com.quietlip.carol_shop.model.Plans;
import com.quietlip.carol_shop.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.*;

@AllArgsConstructor
@Service
public class PlansService {
    public static final String DB_API_TEST_URL = "https://api.coindesk.com";

    @Autowired
    private final PlansCollectionRepo
            plansCollectionRepo;
    @Autowired
    private final MongoOperations mongoOperations;

    @Bean
    public WebClient getWebClient(){
        return WebClient.builder().defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    public List<Plans> getPlans(){
        return plansCollectionRepo.findAll();
    }

    public String getStockInfo(WebClient webClient){
        System.out.println("Stock info called");
        System.out.println(webClient == null ? "N/A" : "Not null");
        WebClient.ResponseSpec responseSpec = webClient.get()
                .uri("https://api.coindesk.com/v1/bpi/currentprice.json")
                .retrieve()
                        .onStatus(HttpStatus::isError, response -> response.bodyToMono(Map.class)
                                .flatMap(body -> {
                                    return Mono.error(new Exception(body.toString()));
                                }));
        System.out.println(responseSpec);
        String responseBody = responseSpec.bodyToMono(String.class).block();
        System.out.println(responseBody);
        return responseBody;
    }

//    public ResponseEntity getLocalTestServer(){
//
//    }

    public boolean addUser(User newUser){
        mongoOperations.insert(newUser);
        return false;
    }

//    public User getUser(){
//        Query query = new Query();
//        query.addCriteria(Criteria.where("username").is())
//    }
}
