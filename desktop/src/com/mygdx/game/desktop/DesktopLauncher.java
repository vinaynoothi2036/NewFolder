package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title= MyGdxGame.TITLE + "v" + MyGdxGame.VERSION;
		config.vSyncEnabled = true;
		config.width=780;
		config.height=620;
		config.title="Score Cards";
		new LwjglApplication(new MyGdxGame(), config);
	}
}
