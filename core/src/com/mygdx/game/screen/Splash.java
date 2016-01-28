package com.mygdx.game.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.com.mygdx.game.tween.SpriteAcessor;
import com.mygdx.game.screen.basetween.BaseTween;
import com.mygdx.game.tween.Tween;
import com.mygdx.game.tween.TweenManager;

import java.util.stream.BaseStream;

import javax.security.auth.callback.Callback;

public class Splash implements Screen {

        private SpriteBatch batch;
        private Sprite splash;
        private TweenManager tweenManager;


        @Override
        public void show() {
            batch = new SpriteBatch();
            tweenManager = new TweenManager();
            Tween.registerAcessor(Sprite.class, new SpriteAcessor() {
                @Override
                public int getValues(Sprite target, int tweenType, float returnValues) {
                    return 0;
                }
            });


            Texture splashTexture = new Texture(Gdx.files.internal("luigifront.png"));
            splash = new Sprite(splashTexture);
            splash.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

            Tween.set(splash, SpriteAcessor.ALPHA).target(0).start(tweenManager);
            Tween.to(splash, SpriteAcessor.ALPHA, 2).target(1).repeatYoyo(1,2).setCallback(new Callback()
            {
                @Override
                public void onEvent(int type, BaseTween<?> source){
                    ((Game) Gdx.app.getApplicationListener()).setScreen((Screen) new MainMenuScreen());
                }
            }).start(tweenManager);
            Tween.to(splash, SpriteAcessor.ALPHA, 2).target(0).delay(2).start(tweenManager);



        }

        @Override
        public void render(float delta) {
            Gdx.gl.glClearColor(0,0,0,1);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
            tweenManager.update(delta);


            batch.begin();
            splash.draw(batch);
            batch.end();
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
            batch.dispose();
            splash.getTexture().dispose();

        }
    }
