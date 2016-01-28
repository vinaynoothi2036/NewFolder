package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;


public class MainMenuScreen implements Screen{

    private Stage stage;
    private Skin skin;
    private TextureAtlas atlas;
    private Table table;
    private TextButton buttonPlay,buttonExit;
    private BitmapFont white,black;
    private Label heading;

    @Override
    public void show() {
        stage = new Stage();


        //atlas = new TextureAtlas("ui/button.pack");
        //skin = new Skin(atlas);
        table = new Table();
        table.setBounds(0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());


        Label.LabelStyle textLabel=new Label.LabelStyle();
        textLabel.font = new BitmapFont();
        Label nameLabel = new Label("Name:", textLabel);

        TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.up = skin.getDrawable("button.up");
        textButtonStyle.down = skin.getDrawable("button.down");
        textButtonStyle.pressedOffsetX = -1;
        textButtonStyle.pressedOffsetY = -1;
        textButtonStyle.font = black;

        buttonExit = new TextButton("Exit",textButtonStyle);
        buttonExit.pad(20);


        table.add(buttonExit);
        table.debug();
        table.add(nameLabel);
        stage.addActor(table);



    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(delta);

        stage.draw();

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
