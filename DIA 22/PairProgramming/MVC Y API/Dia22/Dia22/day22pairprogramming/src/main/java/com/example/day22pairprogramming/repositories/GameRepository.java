package com.example.day22pairprogramming.repositories;

import com.example.day22pairprogramming.models.Game;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {

    
}
