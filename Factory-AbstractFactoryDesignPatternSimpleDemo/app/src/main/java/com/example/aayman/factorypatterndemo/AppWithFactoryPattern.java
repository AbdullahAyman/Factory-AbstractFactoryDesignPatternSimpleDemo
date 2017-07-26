package com.example.aayman.factorypatterndemo;

import com.example.aayman.factorypatterndemo.ChessGame.ChessItem;
import com.example.aayman.factorypatterndemo.ChessGame.ChessItemFactory;

import java.util.Scanner;

/**
 * Created by aayman on 6/8/2017.
 */
public class AppWithFactoryPattern {
    public static void main(String[] args) {
        ChessItemFactory chessItemFactory = new ChessItemFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz, enter your selected item to be moved\n S for Solider\n K for King\n H for Knight\n R for Rook");
        String itemName = scanner.nextLine();
        ChessItem chessItem = chessItemFactory.assignItem(itemName);
        if (chessItem != null) {
            chessItem.moveItem();
            chessItem.moveStep();
        }
    }
}
