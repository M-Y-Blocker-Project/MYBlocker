package com.github.MYBlocker;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class TimeLabel implements ActionListener{
    JButton upperButton;
    JButton lowerButton;
    int base;
    int time = 0;
    boolean adjustment = true;
    JLabel label = new JLabel("0"); //If this is static, we cannot get 3 labels but only 1 label.

    void makeEnable(){
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        label.setPreferredSize(new Dimension(100, 50));
        LineBorder border = new LineBorder(Color.BLACK, 2, true);
        label.setBorder(border);

        upperButton.addActionListener(this);
        upperButton.setActionCommand("upperButton");

        lowerButton.addActionListener(this);
        lowerButton.setActionCommand("lowerButton");
    }

    @Override
    public void actionPerformed(ActionEvent event){
        String cmd = event.getActionCommand();

        if (cmd.equalsIgnoreCase("upperButton")){
            time += 1;
            //System.out.println(time + ":" + base);
            if (base == 60) {
                if (time > 59) {
                    time = 0;
                }
            }
        }else if(cmd.equalsIgnoreCase("lowerButton") && adjustment){
            time -= 1;
            //System.out.println(time + ":" + base);
            if(time < 0){
                if(base != 10){
                    time = 59;
                }else{
                    time = 0;
                }
            }
        }
        String strTime = Integer.toString(time);
        label.setText(strTime);
    }
}

