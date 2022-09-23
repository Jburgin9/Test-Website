package com.quietlip.carol_shop.api;

import com.quietlip.carol_shop.model.Inventory;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InventoryService {
    @Autowired
    private final InventoryCollectionRepo
            inventoryCollectionRepo;


    public List<Inventory> getInventory(){
        return inventoryCollectionRepo.findAll();
    }

//    public Long getPlans(){
//        return plansCollectionRepo.getCollection("plans")
//                .countDocuments();
//    }


}
