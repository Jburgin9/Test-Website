package com.quietlip.carol_shop.api;

import com.quietlip.carol_shop.model.Plans;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PlansCollectionRepo
        extends MongoRepository<Plans, String> {

//    @Query(value ="{'username' }")
}
