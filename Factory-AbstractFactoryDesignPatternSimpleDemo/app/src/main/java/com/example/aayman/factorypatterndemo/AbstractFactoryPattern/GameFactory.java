package com.example.aayman.factorypatterndemo.AbstractFactoryPattern;

import com.example.aayman.factorypatterndemo.ChessGame.ChessItem;
import com.example.aayman.factorypatterndemo.ChessGame.ChessItemFactory;
import com.example.aayman.factorypatterndemo.PokerGame.JackCard;
import com.example.aayman.factorypatterndemo.PokerGame.KingCard;
import com.example.aayman.factorypatterndemo.PokerGame.PokerCard;
import com.example.aayman.factorypatterndemo.PokerGame.PokerCardFactory;
import com.example.aayman.factorypatterndemo.PokerGame.QueenCard;

/**
 * Created by aayman on 6/11/2017.
 */

public class GameFactory implements ICreateGameFactory {
    public void assignPoker(String event) {
        switch (event) {
            case "P":
                IStartGame pokerCardFactory = new PokerCardFactory();
                PokerCard pokerCard = new PokerCardFactory().assignPoker(event);
                pokerCardFactory.StartGame(pokerCard);
                break;
            case "C":
                IStartGame pokerCardFactory1= new ChessItemFactory();
                ChessItem pokerCard1 = new ChessItemFactory().assignItem(event);
                pokerCardFactory1.StartGame(pokerCard1);
                break;
            default:
                break;

        }
    }
    @Override
    public void createGame(String event) {
        assignPoker(event);
    }

}
