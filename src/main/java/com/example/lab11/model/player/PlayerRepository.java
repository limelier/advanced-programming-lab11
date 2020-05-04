package com.example.lab11.model.player;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends MongoRepository<Player, String> {
    List<Player> findByName(@Param("name") String name);
}
