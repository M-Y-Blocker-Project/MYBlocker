package com.github.MYBlocker;

import java.io.File;

public class PathMaker {
    public static String makePath(String file_name){
        String path_head = "MYBlocker\\scr\\com\\github\\MYBlocker\\";
        String path = path_head + file_name;
        File file = new File(path);
        System.out.println(file.getAbsolutePath());
        String aPath = file.getAbsolutePath();
        return(aPath);
    }
}
