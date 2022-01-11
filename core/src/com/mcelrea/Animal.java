package com.mcelrea;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Animal {
    private Texture image;
    private int loc;
    private int y;

    //1-argument constructor
    public Animal(int y) {
        image = new Texture("animal foot.png");
        loc = 0;
        this.y = y;
    }

    public void step() {
        //random number from 1-10
        int randNum = (int)(1 + Math.random() * 10);

        //70% chance of being true
        if(randNum > 3) {
            loc++;
        }
        else { //30% chance
            loc--;
            //don't go negative
            if(loc < 0) {
                loc = 0;
            }
        }
    }

    public void draw(SpriteBatch spriteBatch) {
        spriteBatch.draw(image, loc, y, 30, 30);
    }

    public int getLoc() {
        return loc;
    }

    public void setLoc(int loc) {
        this.loc = loc;
    }

    public Texture getImage() {
        return image;
    }

    public void setImage(Texture image) {
        this.image = image;
    }
}
