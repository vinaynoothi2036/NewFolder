package com.mygdx.game.com.mygdx.game.tween;

import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Admin on 22-01-2016.
 */
public interface TweenAcessor<T> {
    int getValues(Sprite target, int tweenType, float returnValues);

    int getValues(Sprite target, int tweenType, float[] returnValues);

    void SetValues(Sprite target, int tweenType, float[] newValues);
}
