package com.quietlip.carol_shop.view;

import com.quietlip.carol_shop.api.dao.inventory.InventoryService;
import com.quietlip.carol_shop.api.exception.unused.ApiRequestException;
import com.quietlip.carol_shop.model.Inventory;
import com.quietlip.carol_shop.model.Plans;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/database")
public class CollectionsController {
    private final InventoryService
            inventoryService;
    private MongoTemplate mongoDb;

    @GetMapping("/inventory")
    public List<Inventory> fetchInventory(){
        return mongoDb.findAll(Inventory.class);
    }

    @GetMapping("/plans")
    public List<Plans> fetchPlans(){
        return mongoDb.findAll(Plans.class);
    }

    public ApiRequestException requestException(){
        throw new ApiRequestException("Error");
    }

    @ExceptionHandler
    public Exception errorPage(){
        return new IllegalStateException("wrong");
    }
}
