package com.example.day22pairprogramming.controllers;

import java.util.ArrayList;

import com.example.day22pairprogramming.models.Game;
import com.example.day22pairprogramming.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping("all")
    public ArrayList<Game> getGames(){
        return gameService.getGames();
    }

    @PostMapping("create")
    public Game saveGame(@RequestBody Game game){
        return gameService.saveGame(game);
    }
    
}
