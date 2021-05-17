package com.github.MYBlocker;

import java.io.File;

public class PathMaker {
    public static String makePath(String file_name){
        String path_head = "src\\com\\github\\MYBlocker\\";
        String path = path_head + file_name;
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        return(absolutePath);
    }
}
