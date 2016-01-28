package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.screen.MainMenuScreen;

public class MyGdxGame extends Game {
	public static final String TITLE="SportsCards" , VERSION="0.0.0.0.reallyEarly";

	@Override
	public void create () {
		setScreen(new MainMenuScreen());

	}
	@Override
	public void dispose() {

		super.dispose();
	}


	@Override
	public void render () {
		super.render();

	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {

		super.resume();
	}


}
