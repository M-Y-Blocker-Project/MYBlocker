package com.github.MYBlocker;

import javax.swing.*;
import java.awt.*;

class PartsMaker extends PathMaker{


    ImageIcon makeMikamiYua(){
        String MikamiPath = makePath("mentos_tea.jpg");
        ImageIcon MikaMiPhoto = new ImageIcon(MikamiPath);
        return(MikaMiPhoto);
    }

    static JButton makeUpperButton(){
        String ButtonPath = makePath("UpperButton.gif");
        ImageIcon ButtonPhoto = new ImageIcon(ButtonPath);
        JButton Button = new JButton(ButtonPhoto);
        return(Button);
    }

    static JButton makeLowerButton(){
        String ButtonPath = makePath("LowerButton.png");
        ImageIcon ButtonPhoto = new ImageIcon(ButtonPath);
        JButton Button = new JButton(ButtonPhoto);
        return(Button);
    }

    static StartButton makeStartButton(TimeLabel lTimeLabel, TimeLabel cTimeLabel, TimeLabel rTimeLabel){
        StartButton button = new StartButton();
        button.lTimeLabel = lTimeLabel;
        button.cTimeLabel = cTimeLabel;
        button.rTimeLabel = rTimeLabel;
        button.makeEnable();
        return(button);
    }

    static TimeLabel makeTimeLabel(JButton uButton, JButton lButton, int pBase){
         TimeLabel timeLabel = new TimeLabel();
         timeLabel.upperButton = uButton;
         timeLabel.lowerButton = lButton;
         timeLabel.base = pBase;
         return(timeLabel);
    }

    static JPanel makePanel(JButton upperButton, JButton lowerButton, TimeLabel timeLabel) {
        timeLabel.makeEnable();
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel clock = timeLabel.label;
        panel.add(upperButton, BorderLayout.NORTH);
        panel.add(lowerButton, BorderLayout.SOUTH);
        panel.add(clock, BorderLayout.CENTER);
        return (panel);
    }
}