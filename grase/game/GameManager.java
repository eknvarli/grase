package grase.game;

import java.awt.event.KeyEvent;

import grase.engine.AbstractGame;
import grase.engine.GameContainer;
import grase.engine.Renderer;
import grase.engine.gfx.Image;
import grase.engine.gfx.ImageTitle;

public class GameManager extends AbstractGame {
    private ImageTitle image;

    public GameManager() {
        image = new ImageTitle("/test.png", 64, 64);
    }

    @Override
    public void update(GameContainer gc, float dt) {
        if (gc.getInput().isKeyDown(KeyEvent.VK_A)) {
            System.out.println("A was pressed.");
        }

        temp += dt;

        if (temp > 3) {
            temp = 0;
        }
    }

    float temp = 0;

    @Override
    public void render(GameContainer gc, Renderer renderer) {
        renderer.drawFillRect(gc.getInput().getMouseX() - 200, gc.getInput().getMouseY() - 200, 400, 400, 0xffffccff);
    }

    public static void main(String[] args) {
        GameContainer gc = new GameContainer(new GameManager());
        gc.start();
    }
    
}
