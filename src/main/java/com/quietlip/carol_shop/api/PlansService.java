package com.quietlip.carol_shop.api;

import com.quietlip.carol_shop.model.Plans;
import com.quietlip.carol_shop.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PlansService {
    @Autowired
    private final PlansCollectionRepo plansCollectionRepo;
    @Autowired
    private final MongoOperations mongoOperations;

    public List<Plans> getPlans(){
        return plansCollectionRepo.findAll();
    }

    public boolean addUser(User newUser){
        mongoOperations.insert(newUser);
        return false;
    }

//    public User getUser(){
//        Query query = new Query();
//        query.addCriteria(Criteria.where("username").is())
//    }
}
