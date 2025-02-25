package com.js_packs.layouts;

import javax.swing.*;
import java.awt.event.*;

public class Main_Menu_0 extends JFrame {

    JPanel panel = new JPanel();

    public Main_Menu_0(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        add(panel);
        setVisible(true);
        JButton start = new JButton("Start");
        panel.add(start);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Main_Frame frame = new Main_Frame();
                frame.setVisible(true);
                dispose();
            }
        });
    }
}
