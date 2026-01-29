package org.example;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;
    private String name;

    public Deck(List<Card> cards, String name) {
        this.cards = cards != null ? new ArrayList<>(cards) : new ArrayList<>();
        this.name = name;
    }

    public Deck(String name) {
        this(new ArrayList<>(), name);
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }

    public void setCards(List<Card> cards) {
        this.cards = cards != null ? new ArrayList<>(cards) : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCard(Card card) {
        if (card != null) cards.add(card);
    }

    public boolean removeCard(Card card) {
        return cards.remove(card);
    }
}
