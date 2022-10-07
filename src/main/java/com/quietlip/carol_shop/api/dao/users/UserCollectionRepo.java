package com.quietlip.carol_shop.api.dao.users;

import com.mongodb.client.MongoCollection;
import com.quietlip.carol_shop.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserCollectionRepo extends MongoRepository<User, String> {
    @Query
    public User findUserByUsername(String username);
}
