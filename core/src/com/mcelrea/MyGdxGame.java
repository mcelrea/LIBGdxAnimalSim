package com.mcelrea;

/*
 * If you are using Intellij idea, this might help:
 *    Settings -> Build, Execution, Deployment ->
 *                Gradle ->
 *                Build and run using: IntelliJ IDEA
 */

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	int x = 0;
	int y = 700;
	Animal a;
	Animal a2;
	Turtle t;
	Hare h;

	@Override
	public void create () {
		batch = new SpriteBatch();
		a = new Animal(700);
		a2 = new Animal(600);
		t = new Turtle(400);
		h = new Hare(200);
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);

		a.step();
		a2.step();
		t.step();
		h.step();

		//MUST draw all graphics between begin() and end()
		batch.begin();
		a.draw(batch);
		a2.draw(batch);
		t.draw(batch);
		h.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
