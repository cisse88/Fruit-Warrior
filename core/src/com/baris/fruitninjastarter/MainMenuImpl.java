package com.baris.fruitninjastarter;

import com.badlogic.gdx.graphics.Texture;

public class MainMenuImpl extends MainMenu {

    FruitNinja game;
    Texture bg;
    Texture pt;

    public void MainMenu (FruitNinja game){
        this.game = game;
        bg = new Texture("menubg.png");
        pt = new Texture("play_btn.png");

    }






    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        game.batch.begin();

        game.batch.draw(bg,0,0);

        game.batch.end();

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
