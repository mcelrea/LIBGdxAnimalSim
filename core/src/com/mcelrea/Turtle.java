package com.mcelrea;

import com.badlogic.gdx.graphics.Texture;

public class Turtle extends Animal {

    //MAIN RULE # UNO
    //MUST call the super class (Animal) constructor within
    //  you own constructor
    public Turtle(int y) {
        super(y);
        setImage(new Texture("turtle.png"));
    }

    //overidden method
    public void step() {


        int randomNum = (int)(1 + Math.random()*10);
        if(randomNum <= 6) { //60% chance of movement
            setLoc(getLoc()+1);
        }

    }

}
