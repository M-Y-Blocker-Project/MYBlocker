package com.github.MYBlocker;

import javax.swing.*;

public class ContentsMaker extends PartsMaker{

    static JButton lUpperButton = makeUpperButton();
    static JButton lLowerButton = makeLowerButton();
    static TimeLabel lTimeLabel = makeTimeLabel(lUpperButton, lLowerButton, 10);
    static JPanel lPanel = makePanel(lUpperButton, lLowerButton, lTimeLabel);

    static JButton cUpperButton = makeUpperButton();
    static JButton cLowerButton = makeLowerButton();
    static TimeLabel cTimeLabel = makeTimeLabel(cUpperButton, cLowerButton, 60);
    static JPanel cPanel = makePanel(cUpperButton, cLowerButton, cTimeLabel);

    static JButton rUpperButton = makeUpperButton();
    static JButton rLowerButton = makeLowerButton();
    static TimeLabel rTimeLabel = makeTimeLabel(rUpperButton, rLowerButton, 60);
    static JPanel rPanel = makePanel(rUpperButton, rLowerButton, rTimeLabel);

    static StartButton button = makeStartButton(lTimeLabel, cTimeLabel, rTimeLabel);
}
