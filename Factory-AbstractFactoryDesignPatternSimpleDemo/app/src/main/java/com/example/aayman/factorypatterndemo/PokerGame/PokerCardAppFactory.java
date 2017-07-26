package com.example.aayman.factorypatterndemo.PokerGame;

import java.util.Scanner;

/**
 * Created by aayman on 6/11/2017.
 */

public class PokerCardAppFactory {
    public static void main(String[] args) {
        PokerCardFactory pokerCardFactory = new PokerCardFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz, enter your selected item to be played\n K for King \n Q for Queen \n J for Jack");
        String itemName = scanner.nextLine();
        PokerCard pokerItem = pokerCardFactory.assignPoker(itemName);
        if (pokerItem != null) {
            pokerItem.playItem();
            pokerItem.displayedCard();
        }
    }
}
