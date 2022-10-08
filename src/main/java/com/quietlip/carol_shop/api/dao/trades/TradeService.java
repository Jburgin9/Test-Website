package com.quietlip.carol_shop.api.dao.trades;

import com.quietlip.carol_shop.model.Trade;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TradeService {
    @Autowired
    private TradesCollectionRepo tradesCollectionRepo;

    public List<Trade> listAllTrades(){
        return tradesCollectionRepo.findAll();
    }

    public void insertTrade(Trade tradeIdea) {
        tradesCollectionRepo.insert(tradeIdea);
    }
}
