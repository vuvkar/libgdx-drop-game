package com.badlogic.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by nepjua on 09/08/14.
 */
public class Drop extends Game {
    public BitmapFont font;
    public SpriteBatch batch;

    MainMenuScreen menu;
    private GameScreen screen;

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        menu = new MainMenuScreen(this);
        screen = new GameScreen(this);

        showMenu();
    }

    public void showMenu() {
        screen.hide();
        this.setScreen(menu);
    }

    public void showGame() {
        menu.hide();
        setScreen(screen);
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }
}
