package com.example.aayman.factorypatterndemo.AbstractFactoryPattern;

import com.example.aayman.factorypatterndemo.ChessGame.ChessItem;

/**
 * Created by aayman on 6/11/2017.
 */

public interface ICreateGameFactory {
    void createGame(String event);

}
