package com.quietlip.carol_shop.api.dao.inventory;

import com.quietlip.carol_shop.model.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryCollectionRepo
        extends MongoRepository<Inventory, String> {

}
