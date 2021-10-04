package com.github.MYBlocker;

import java.awt.*;
import javax.swing.*;

public class Main extends ContentsMaker{
    public static void main(String[] args) {
        JFrame frame = new JFrame("MYBlocker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(lPanel, BorderLayout.WEST);
        frame.getContentPane().add(cPanel, BorderLayout.CENTER);
        frame.getContentPane().add(rPanel, BorderLayout.EAST);
        frame.getContentPane().add(button.button, BorderLayout.PAGE_END);
    }
}