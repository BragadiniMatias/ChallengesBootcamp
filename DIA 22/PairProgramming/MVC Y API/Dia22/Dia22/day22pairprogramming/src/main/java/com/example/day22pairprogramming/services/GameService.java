package com.example.day22pairprogramming.services;

import java.util.ArrayList;

import com.example.day22pairprogramming.models.Game;
import com.example.day22pairprogramming.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    
    @Autowired
    GameRepository gameRepository;

    public ArrayList<Game> getGames(){
        return (ArrayList<Game>) gameRepository.findAll();
    }

    public Game saveGame(Game game){
        return gameRepository.save(game);
    }
}
