package com.mygdx.game.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.MyGdxGame;

/**
 * Created by Admin on 23-01-2016.
 */
public class AbstractScreen implements Screen {
    protected final MyGdxGame MainGame ;
    protected final Stage stage;

    public AbstractScreen(MyGdxGame game, Stage stage) {
        MainGame = game;
        this.stage = stage;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
