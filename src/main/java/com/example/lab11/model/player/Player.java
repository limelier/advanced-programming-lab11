package com.example.lab11.model.player;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.util.Assert;

public class Player {
    @Id private String id;
    @Indexed(unique = true)
    private String name;

    public Player(String name) {
        Assert.hasText(name, "The name cannot be null or empty.");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Assert.hasText(name, "The name cannot be null or empty.");
        this.name = name;
    }
}
