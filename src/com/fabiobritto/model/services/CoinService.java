package com.fabiobritto.model.services;

import com.fabiobritto.model.entities.Coin;
import com.fabiobritto.model.services.exceptions.APIException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class CoinService {
    
    private String path = " https://v6.exchangerate-api.com/v6/";
    private String apiKey = "ddfce1a2d30a5a6fdb943e3e/latest/";
    
    HttpClient client = HttpClient.newHttpClient();
    
    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES).setPrettyPrinting().create();
    
    public Coin getCoinByName(String coinName){
        String pathUrl = path + apiKey + coinName.toUpperCase();
        try{
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(pathUrl))
                .build();
            HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
        }
        catch(IOException e){
            //throw new APIException(e.getMessage());
            System.out.println(e.getMessage());
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        
        
        return null;
    }
}
