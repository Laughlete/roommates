package com.halmer.roommates;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.halmer.roommates.states.GameStateManager;
import com.halmer.roommates.states.MenuState;

public class Roommates extends ApplicationAdapter {
	public static final int WIDTH = 800;
	public static final int HEIGHT = 480;

	public static final String TITLE = "Roommates";
	private GameStateManager gsm;
	private SpriteBatch sb;

	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		Gdx.gl.glClearColor(0.9f, 0, 1.0f, 1);
		batch = new SpriteBatch();
		gsm = new GameStateManager();
		gsm.push(new MenuState(gsm));
		//img = new Texture("jimmy.jpg");
	}

	@Override
	public void render () {

		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}
}
