package com.gturedi.util;

public class StringUtil {

    public static String sayMyName(String whoAsking) {
        if (whoAsking.toLowerCase().equals("walter white")) return "heisenberg";
        return whoAsking;
    }

}