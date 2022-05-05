package com.example.day22pairprogrammingmvc.controllers.services;

import java.util.ArrayList;

import com.example.day22pairprogrammingmvc.models.Game;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GameService {
    
    public ArrayList<Game> getgames(){
        String url = "http://localhost:8080/api/games/all";
        RestTemplate restTemplate = new RestTemplate();
        ArrayList<Game> games = new ArrayList<Game>();
        games = restTemplate.getForObject(url, ArrayList.class);
        return games;
    }

    public void saveGame(Game game){
        String url = "http://localhost:8080/api/games/create";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(url, game, Game.class);
    }

}
