package com.quietlip.carol_shop.api.dao.trades;

import com.quietlip.carol_shop.model.Trade;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TradesCollectionRepo extends MongoRepository<Trade, String> {
}
