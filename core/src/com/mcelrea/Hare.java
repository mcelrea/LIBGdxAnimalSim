package com.mcelrea;

import com.badlogic.gdx.graphics.Texture;

public class Hare extends Animal {

    private Texture moveImage;
    private Texture sleepImage;
    private final int sleepTime = 30;
    private int currentSleep = 1;
    private boolean isSleeping = false;

    public Hare(int y) {
        super(y);
        moveImage = new Texture("hare moving.png");
        sleepImage = new Texture("hare sleeping.png");
        setImage(moveImage);
    }

    //overidden method
    public void step() {
        //80% chance of movement
        //20% chance of sleep

        if(!isSleeping) {
            int randomNum = (int) (1 + Math.random() * 10);
            if (randomNum <= 8) {
                setLoc(getLoc() + 5);
            } else {
                isSleeping = true;
                setImage(sleepImage);
            }
        }//end if !isSleeping
        else { //he must be sleeping
            currentSleep++;
            if(currentSleep > sleepTime) {
                isSleeping = false;
                currentSleep = 1;
                setImage(moveImage);
            }
        }
    }
}
