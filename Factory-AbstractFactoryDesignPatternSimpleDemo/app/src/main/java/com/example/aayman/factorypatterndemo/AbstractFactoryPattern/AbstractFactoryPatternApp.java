package com.example.aayman.factorypatterndemo.AbstractFactoryPattern;

import java.util.Scanner;

/**
 * Created by aayman on 6/11/2017.
 */

public class AbstractFactoryPatternApp {

    public static void main(String[] args) {
        ICreateGameFactory createGameFactory = new GameFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz, enter your selected item to be played\n P for Poker \n C for Chess");
        String itemName = scanner.nextLine();
        createGameFactory.createGame(itemName);
    }
}
