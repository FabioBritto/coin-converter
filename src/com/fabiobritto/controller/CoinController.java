package com.fabiobritto.controller;

import com.fabiobritto.model.entities.Coin;
import com.fabiobritto.model.services.CoinService;
import com.fabiobritto.view.CoinView;

public class CoinController {

    private CoinView coinView;
    private CoinService coinService;
    
    public void getCoinByName(){
        String coinName = coinView.chooseByName();
        Coin coin = coinService.getCoinByName(coinName);
    }
}
