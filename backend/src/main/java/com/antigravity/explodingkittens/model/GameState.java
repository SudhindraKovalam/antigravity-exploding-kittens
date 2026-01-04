package com.antigravity.explodingkittens.model;

import java.util.ArrayList;
import java.util.List;

public class GameState {
    private List<Player> players;
    private Deck drawPile;
    private List<Card> discardPile;
    private int currentPlayerIndex;
    private int actionsRemaining; // For attack cards (2 turns)

    public GameState() {
        this.players = new ArrayList<>();
        this.drawPile = new Deck();
        this.discardPile = new ArrayList<>();
        this.currentPlayerIndex = 0;
        this.actionsRemaining = 1;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public Player getCurrentPlayer() {
        if (players.isEmpty()) return null;
        return players.get(currentPlayerIndex);
    }

    public void nextTurn() {
        // Simple round robin, skip eliminated players
        do {
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        } while (players.get(currentPlayerIndex).isEliminated());
        
        actionsRemaining = 1;
    }
    
    // Getters
    public List<Player> getPlayers() { return players; }
    public Deck getDrawPile() { return drawPile; }
    public List<Card> getDiscardPile() { return discardPile; }
}
