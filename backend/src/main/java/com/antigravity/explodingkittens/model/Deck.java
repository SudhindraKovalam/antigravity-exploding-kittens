package com.antigravity.explodingkittens.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void addCountOfCardType(CardType type, int count, String title, String description) {
        for (int i = 0; i < count; i++) {
            this.cards.add(new Card(type, title, description));
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card draw() {
        if (cards.isEmpty()) {
            return null; // Or throw exception
        }
        return cards.remove(cards.size() - 1); // Draw from "top" (end of list)
    }

    public int remainingCards() {
        return cards.size();
    }
}
