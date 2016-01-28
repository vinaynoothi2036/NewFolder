package com.mygdx.game.com.mygdx.game.tween;


import com.badlogic.gdx.graphics.g2d.Sprite;

    public abstract class SpriteAcessor implements TweenAcessor<Sprite>{
        public static final int ALPHA = 0;

        @Override
        public int getValues(Sprite target, int tweenType, float[] returnValues) {
        switch (tweenType)
        {
            case ALPHA:
                returnValues[0] = target.getColor().a;
                return 1;
            default:
                assert false;
                return -1;
        }
    }
        @Override
        public void SetValues(Sprite target, int tweenType, float[] newValues) {
            switch (tweenType)
            {
                case ALPHA:
                    target.setColor(target.getColor().r,target.getColor().g,target.getColor().b,newValues[0]);
                    break;
                default:
                    assert false;

            }
        }

}
