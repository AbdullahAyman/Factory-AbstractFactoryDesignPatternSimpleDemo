package com.example.aayman.factorypatterndemo.PokerGame;

import com.example.aayman.factorypatterndemo.AbstractFactoryPattern.Game;
import com.example.aayman.factorypatterndemo.AbstractFactoryPattern.GameFactory;
import com.example.aayman.factorypatterndemo.AbstractFactoryPattern.IStartGame;

import java.util.Scanner;

/**
 * Created by aayman on 6/11/2017.
 */

public class PokerCardFactory implements IStartGame{
    public PokerCard assignPoker(String event) {
        switch (event) {
            case "K":
                return new KingCard();
            case "Q":
                return new QueenCard();
            case "J":
                return new JackCard();
            default:
                return null;
        }
    }


    @Override
    public void StartGame(Game game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz, enter your selected item to be played\n K for King \n Q for Queen \n J for Jack");
        String itemName = scanner.nextLine();
        PokerCard pokerItem = assignPoker(itemName);
        if (pokerItem != null) {
            pokerItem.playItem();
            pokerItem.displayedCard();
        }
    }
}
