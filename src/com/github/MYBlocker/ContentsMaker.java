package com.github.MYBlocker;

import javax.swing.*;

public class ContentsMaker extends PartsMaker{
    static PartsMaker m = new PartsMaker();

    static JButton lUpperButton = makeUpperButton(m);
    static JButton lLowerButton = makeLowerButton(m);
    static TimeLabel lTimeLabel = makeTimeLabel(lUpperButton, lLowerButton, 10);
    static JPanel lPanel = makePanel(lUpperButton, lLowerButton, lTimeLabel);

    static JButton cUpperButton = makeUpperButton(m);
    static JButton cLowerButton = makeLowerButton(m);
    static TimeLabel cTimeLabel = makeTimeLabel(cUpperButton, cLowerButton, 60);
    static JPanel cPanel = makePanel(cUpperButton, cLowerButton, cTimeLabel);

    static JButton rUpperButton = makeUpperButton(m);
    static JButton rLowerButton = makeLowerButton(m);
    static TimeLabel rTimeLabel = makeTimeLabel(rUpperButton, rLowerButton, 60);
    static JPanel rPanel = makePanel(rUpperButton, rLowerButton, rTimeLabel);

    static StartButton button = makeStartButton(lTimeLabel, cTimeLabel, rTimeLabel);
}
