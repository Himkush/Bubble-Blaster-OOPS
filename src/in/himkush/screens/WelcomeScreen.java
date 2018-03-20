package in.himkush.screens;

import in.himkush.main.GamePanel;
import in.himkush.resources.Resources;

import java.awt.*;

public class WelcomeScreen extends Screen {


    public WelcomeScreen(GamePanel p) {
        super(p);
    }

    public void draw(Graphics g){
        g.setColor(Color.blue);
        g.drawImage(Resources.welcome,0,125,null);


    }

    @Override
    public void onMousePress(int xCord, int yCord) {
        if(255<xCord && xCord<340 &&
        300<yCord && yCord<380   ){
            this.gpanel.currentScreen =new Stage1(this.gpanel);
        }
    }
}
