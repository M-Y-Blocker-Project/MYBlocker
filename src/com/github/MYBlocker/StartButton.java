package com.github.MYBlocker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class StartButton implements ActionListener {

    TimeLabel lTimeLabel;
    TimeLabel cTimeLabel;
    TimeLabel rTimeLabel;
    boolean adjustment = true;
    Timer timer = new Timer(false);

    TimerTask makeTask(){
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                int hour = lTimeLabel.time * 3600;
                int minute = cTimeLabel.time * 60;
                int second = rTimeLabel.time;
                int count = hour + minute + second;
                if ( count == 0 ) {
                    timer.cancel();
                    lTimeLabel.adjustment = true;
                    cTimeLabel.adjustment = true;
                    rTimeLabel.adjustment = true;
                    //adjustment = true;
                }
                count -= 1;
                lTimeLabel.time = count / 3600;
                cTimeLabel.time = (count % 3600) / 60;
                rTimeLabel.time = ((count % 3600) % 60);
                lTimeLabel.label.setText(Integer.toString(hour));
                cTimeLabel.label.setText(Integer.toString(minute));
                rTimeLabel.label.setText(Integer.toString(second));
                //System.out.println(rTimeLabel.time);
                //System.out.println(rTimeLabel.adjustment);
            }
        };
        return task;
    }

    JButton button = new JButton("Start your Schedule!");

    void makeEnable(){
        button.addActionListener(this);
        button.setActionCommand("startButton");
    }

    @Override
    public void actionPerformed(ActionEvent event){
        String cmd = event.getActionCommand();
        if (cmd.equalsIgnoreCase("startButton") && adjustment){
            TimerTask task = makeTask();
            lTimeLabel.adjustment = false;
            cTimeLabel.adjustment = false;
            rTimeLabel.adjustment = false;
            adjustment = false;
            timer.schedule(task,1000,1000);
        }
    }
}
