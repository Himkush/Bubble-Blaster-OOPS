package in.himkush.entity;

import in.himkush.resources.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Balloon extends Entity {
    public int upper;
    public int lower;
    public Balloon(int x, int y, Image i) {
        super(x, y);
//        this.upper  = upperLimit;
//        this.lower = lowerLimit;
        this.height = 119;
        this.width = 119;
        this.yVel = -4;
        this.image = i;

    }

    }






