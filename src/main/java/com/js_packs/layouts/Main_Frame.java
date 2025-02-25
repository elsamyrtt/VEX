package com.js_packs.layouts;

import javax.swing.*;

public class Main_Frame extends JFrame{

    Main_Panel panel = new Main_Panel();

    public Main_Frame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        add(panel);
        setVisible(true);
        panel.requestFocusInWindow();
    }
}