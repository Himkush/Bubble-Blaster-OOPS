package in.himkush.screens;

import in.himkush.main.GamePanel;
import in.himkush.resources.Resources;

import java.awt.*;

public class GameOverScreen extends Screen {

    public GameOverScreen(GamePanel panel) {

        super(panel);
    }

    public void update(){

    }
    public void draw(Graphics g) {



        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Game Over. Press any key to continue", 10, 20);
        g.drawImage(Resources.overGame,30,100,null);
    }
    @Override
    public void onKeyPress(int keyCode) {
        this.gpanel.currentScreen = new Stage1(this.gpanel);
    }

}
