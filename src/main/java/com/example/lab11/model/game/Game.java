package com.example.lab11.model.game;

import com.example.lab11.model.player.Player;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.util.Assert;

import java.util.List;

public class Game {
    @Id private String id;
    @DBRef private Player host;
    @DBRef private Player guest;
    private int[][] endState;
    private List<Move> moveList;
    private Player winner;

    public Game() {}

    public Game(Player host, Player guest, int[][] endState, List<Move> moveList, Player winner) {
        Assert.notNull(host, "The host cannot be null.");
        Assert.notNull(guest, "The guest cannot be null.");
        Assert.notNull(endState, "The end state cannot be null.");
        Assert.notNull(moveList, "The move list cannot be null.");

        this.host = host;
        this.guest = guest;
        this.endState = endState;
        this.moveList = moveList;
        this.winner = winner;
    }

    public Player getHost() {
        return host;
    }

    public void setHost(Player host) {
        Assert.notNull(host, "The host cannot be null.");
        this.host = host;
    }

    public Player getGuest() {
        return guest;
    }

    public void setGuest(Player guest) {
        Assert.notNull(guest, "The guest cannot be null.");
        this.guest = guest;
    }

    public int[][] getEndState() {
        return endState;
    }

    public void setEndState(int[][] endState) {
        Assert.notNull(endState, "The end state cannot be null.");
        this.endState = endState;
    }

    public List<Move> getMoveList() {
        return moveList;
    }

    public void setMoveList(List<Move> moveList) {
        Assert.notNull(moveList, "The move list cannot be null.");
        this.moveList = moveList;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
}
