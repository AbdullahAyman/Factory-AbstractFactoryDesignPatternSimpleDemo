package com.example.aayman.factorypatterndemo.PokerGame;

import com.example.aayman.factorypatterndemo.AbstractFactoryPattern.Game;
import com.example.aayman.factorypatterndemo.AbstractFactoryPattern.ICreateGameFactory;

/**
 * Created by aayman on 6/11/2017.
 */

public abstract class PokerCard extends Game {

    private String playerName;
    private String cardValue;

    public String getCardValue() {
        return cardValue;
    }

    public void setCardValue(String cardValue) {
        this.cardValue = cardValue;
    }

    public String getCardName() {
        return playerName;
    }

    public void setCardName(String playerName) {
        this.playerName = playerName;
    }

    public void playItem() {
        System.out.print(getCardName() + " is now playing");
    }

    public void displayedCard() {
        System.out.println(" with " + getCardValue() + " Value");
    }
}
