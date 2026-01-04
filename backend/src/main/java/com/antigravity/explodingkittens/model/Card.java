package com.antigravity.explodingkittens.model;

import java.util.UUID;

public class Card {
    private String id;
    private CardType type;
    private String title;
    private String description;
    private String imageUrl;

    public Card(CardType type, String title, String description) {
        this.id = UUID.randomUUID().toString();
        this.type = type;
        this.title = title;
        this.description = description;
    }

    // Getters and Setters
    public String getId() { return id; }
    public CardType getType() { return type; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
