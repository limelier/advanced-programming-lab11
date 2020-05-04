package com.example.lab11.model.game;

import com.example.lab11.model.player.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameRepository extends MongoRepository<Game, String> {
    List<Game> findByHost(@Param("host") Player host);
    List<Game> findByGuest(@Param("guest") Player guest);
}
