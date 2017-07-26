package com.example.aayman.factorypatterndemo.ChessGame;

import com.example.aayman.factorypatterndemo.AbstractFactoryPattern.ICreateGameFactory;
import com.example.aayman.factorypatterndemo.AbstractFactoryPattern.Game;
import com.example.aayman.factorypatterndemo.AbstractFactoryPattern.IStartGame;
import com.example.aayman.factorypatterndemo.PokerGame.PokerCard;

import java.util.Scanner;

/**
 * Created by aayman on 6/8/2017.
 */
public class ChessItemFactory implements IStartGame{
    public ChessItem assignItem(String event){
        switch (event) {
            case "S":
                return new SoliderItem();
            case "K":
                return new KingItem();
            case "H":
                return new KnightItem();
            case "R":
                return new RookItem();
            default:
                return null;
        }
    }

    @Override
    public void StartGame(Game game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz, enter your selected item to be moved\n S for Solider\n K for King\n H for Knight\n R for Rook");
        String itemName = scanner.nextLine();
        ChessItem pokerItem = assignItem(itemName);
        if (pokerItem != null) {
            pokerItem.moveItem();
            pokerItem.moveStep();
        }
    }
}
