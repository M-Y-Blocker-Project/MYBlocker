package com.github.MYBlocker;

public class PathMaker {
    public static String makePath(String file_name) {
        String path_head = "/com/github/MYBlocker/";
        String path = path_head + file_name;
        return (path);
    }
}
