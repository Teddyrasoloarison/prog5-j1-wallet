package com.wallet;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private String color;
    private List<String> cards;
    private String weight;
    private String brand;
    private Float money;
    private boolean isLost = false;

    public Wallet(String color, List<String> cards, String weight, String brand, Float money, boolean isLost) {
        this.color = color;
        this.cards = new ArrayList<>(cards);
        this.weight = weight;
        this.brand = brand;
        this.money = money;
        this.isLost = isLost;
    }

    public Float takeMoney(Float amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Money must be positive");
        }
        if (amount > this.money) {
            throw new IllegalStateException("Your balance is insufficient");
        }
        this.money -= amount;

        return this.money;
    }

    public Float addMoney(Float amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Money must be positive");
        }
        this.money += amount;
        return this.money;
    }

    public String addCard(String cardName) {
        this.cards.add(cardName);
        return cardName;
    }

    public boolean lost() {
        return this.isLost;
    }

    public String getColor() {
        return color;
    }

    public List<String> getCards() {
        return cards;
    }

    public String getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public Float getMoney() {
        return money;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCards(List<String> cards) {
        this.cards = cards;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public void setLost(boolean lost) {
        this.isLost = lost;
    }

}
