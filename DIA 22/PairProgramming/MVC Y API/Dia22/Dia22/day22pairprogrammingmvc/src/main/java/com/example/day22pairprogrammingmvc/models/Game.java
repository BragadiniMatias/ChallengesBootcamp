package com.example.day22pairprogrammingmvc.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Game {

    private Long id;
    private String name;
    private String genre;
    private String classification;

    public Game(String name, String genre, String classification){
        this.name = name;
        this.genre = genre;
        this.classification = classification;
    }
    
}
