package com.example.aayman.factorypatterndemo;

import com.example.aayman.factorypatterndemo.ChessGame.ChessItem;
import com.example.aayman.factorypatterndemo.ChessGame.KingItem;
import com.example.aayman.factorypatterndemo.ChessGame.KnightItem;
import com.example.aayman.factorypatterndemo.ChessGame.SoliderItem;

import java.util.Scanner;

/**
 * Created by aayman on 6/8/2017.
 */
public class AppTest {
    public static void main(String[] args) {
        ChessItem chessItem = null;
        /*chessItem = new SoliderItem();
        chessItem.moveItem();
        chessItem.moveStep();*/
        //what if we need to apply dynamic changes!!
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz, enter your selected item to be moved S / K / H");
        String itemName = scanner.nextLine();
        switch (itemName) {
            case "S":
                chessItem = new SoliderItem();
                break;
            case "K":
                chessItem = new KingItem();
                break;
            case "H":
                chessItem = new KnightItem();
                break;
            default:
                break;
        }
        if (chessItem != null) {
            chessItem.moveItem();
            chessItem.moveStep();
        }
        /**
         * what if i add new Item Type of chess
         * i have to add new class and change in main method which is wrong
         * also, putting switch check in main function has bad indication(S from SOLID)
        * */
    }
}
