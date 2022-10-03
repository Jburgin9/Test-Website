package com.quietlip.carol_shop.api;

import com.quietlip.carol_shop.model.Plans;
import com.quietlip.carol_shop.model.User;
import com.quietlip.carol_shop.model.YahooAPIResponse;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import reactor.core.publisher.Mono;

import java.util.*;

import static com.quietlip.carol_shop.api.WebsiteController.API_URL;

@AllArgsConstructor
@Service
public class PlansService {
    public static final String DB_API_TEST_URL = "https://api.coindesk.com";

    @Autowired
    private final PlansCollectionRepo plansCollectionRepo;
    @Autowired
    private final MongoOperations mongoOperations;

    @Bean
    public WebClient getWebClient(){
        return WebClient.create();
    }

    public List<Plans> getPlans(){
        return plansCollectionRepo.findAll();
    }

    public Mono getStockInfo(WebClient webClient){
        WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = webClient.method(HttpMethod.GET);
        WebClient.RequestBodySpec bodySpec = uriSpec.uri("/v1/bpi/currentprice.json");
        WebClient.RequestHeadersSpec<?> headersSpec = bodySpec.bodyValue("data");
        Mono<String> response = headersSpec.retrieve().bodyToMono(String.class);
        return response;
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
