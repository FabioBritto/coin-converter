package com.fabiobritto.model.entities;

import java.util.Objects;

public class Coin {

    private String coinName;
    private Double coinValue;
    
    public Coin(){
    }
    
    public Coin(String coinName, Double coinValue){
        this.coinName = coinName;
        this.coinValue = coinValue;
    }
    
    public String getCoinName(){
        return coinName;
    }
    
    public void setCoinName(){
        this.coinName = coinName;
    }
    
    public Double getCoinValue(){
        return coinValue;
    }
    
    public void setCoinValue(){
        this.coinValue = coinValue;
    }
    
    @Override
    public String toString(){
        return "Coin Name: " + coinName + "\nCoinValue: " + coinValue;
    }
    
    //Preciso decidir se vou usar coinName como ID
    @Override
    public int hashCode(){
        return Objects.hash(coinName);
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Coin other = (Coin) obj;
        return Objects.equals(coinName, other.coinName);
    }
}
