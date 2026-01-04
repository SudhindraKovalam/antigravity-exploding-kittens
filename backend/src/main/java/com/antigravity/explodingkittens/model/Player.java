package com.antigravity.explodingkittens.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String id;
    private String name;
    private List<Card> hand;
    private boolean isEliminated;
    private boolean hasDefuse;

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
        this.hand = new ArrayList<>();
        this.isEliminated = false;
        this.hasDefuse = false; // Usually deals one defuse to start
    }

    public void addCardToHand(Card card) {
        this.hand.add(card);
        if (card.getType() == CardType.DEFUSE) {
            this.hasDefuse = true;
        }
    }

    public void removeCardFromHand(Card card) {
        this.hand.remove(card);
        // Check if has defuse still
        // Ideally we iterate to check, simplistically:
        if (card.getType() == CardType.DEFUSE) {
             this.hasDefuse = this.hand.stream().anyMatch(c -> c.getType() == CardType.DEFUSE);
        }
    }

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public List<Card> getHand() { return hand; }
    public boolean isEliminated() { return isEliminated; }
    public void setEliminated(boolean eliminated) { isEliminated = eliminated; }
    public boolean hasDefuse() { return hasDefuse; }
}
