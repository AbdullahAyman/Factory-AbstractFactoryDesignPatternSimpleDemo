package com.example.aayman.factorypatterndemo.ChessGame;

import android.util.Log;

import com.example.aayman.factorypatterndemo.AbstractFactoryPattern.Game;

/**
 * Created by aayman on 6/8/2017.
 */
public abstract class ChessItem extends Game{
    private String itemName;
    private int stepsCount;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setStepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
    }

    public int getStepsCount() {
        return stepsCount;
    }

    public String getItemName() {
        return itemName;
    }

    public void moveItem(){
        System.out.println(getItemName()+" is now moving");
    }

    public void moveStep(){
        System.out.println("with "+getStepsCount()+" Steps");
    }
}
