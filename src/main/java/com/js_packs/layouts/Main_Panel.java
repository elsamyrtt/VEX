package com.js_packs.layouts;

import com.js_packs.classes.Car;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main_Panel extends JPanel {

    public boolean W,A,S,D = false;
    public Car car = new Car(100,100,170);

    public Main_Panel(){

        //Inputs
        setFocusable(true);requestFocusInWindow();addKeyListener(new KeyAdapter(){@Override public void keyPressed(KeyEvent e){switch(e.getKeyCode()){case KeyEvent.VK_W:W=true;break;case KeyEvent.VK_A:A=true;break;case KeyEvent.VK_S:S=true;break;case KeyEvent.VK_D:D=true;break;}}@Override public void keyReleased(KeyEvent e){switch(e.getKeyCode()){case KeyEvent.VK_W:W=false;break;case KeyEvent.VK_A:A=false;break;case KeyEvent.VK_S:S=false;break;case KeyEvent.VK_D:D=false;break;}}});
        //Inputs

        //Main thread / loop
        new Thread(() -> {
            while (true) {
                updateMoves();
                repaint();
                try{Thread.sleep(10);}catch(InterruptedException e1){e1.printStackTrace();}}}).start();
        //Main thread / loop

    }
    public void updateMoves(){
        car.update_moves(W,S,A,D);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        car.draw(g2d);
    }
}