package com.js_packs.classes;

import java.awt.*;

public class Car {
    public int x = 100;
    public int y = 100;
    public int angle = 0;

    public Car(int x,int y,int angle){
        this.x = x;
        this.y = y;
        this.angle = angle;
    }

    public void update_moves(boolean up, boolean down, boolean left, boolean right) {
        if(up){
            System.out.println("u");
        }
        if(down){
            System.out.println("d");
        }
        if(left){
            System.out.println("l");
        }
        if(right){
            System.out.println("r");
        }
    }

    public void draw(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setPaint(Color.BLACK);
        g2d.rotate(angle, x,y);
        g2d.fillRect(x, y, 100, 70);
    }
}
