package com.example.day22pairprogrammingmvc.controllers;

import com.example.day22pairprogrammingmvc.controllers.services.GameService;
import com.example.day22pairprogrammingmvc.models.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/games")
public class GameController {
    
    @Autowired
    GameService gameService;

    @GetMapping("all")
    public String getGames(Model model){
        model.addAttribute("games", gameService.getgames());
        return "GameIndex";
    }

    @GetMapping("/create")
    public String saveGame(Model model){
        Game game = new Game();
        model.addAttribute("game", game);
        return "GameCreate";
    }

    @PostMapping("/create")
    public String addGame(@ModelAttribute("game") Game game){
        gameService.saveGame(game);
        return "redirect:/games/all";
    }


}
