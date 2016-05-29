package com.halmer.roommates.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.halmer.roommates.Roommates;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Roommates.WIDTH;
		config.height = Roommates.HEIGHT;
		config.title = Roommates.TITLE;
		new LwjglApplication(new Roommates(), config);
	}
}
