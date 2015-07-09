package com.example;

import com.gturedi.util.StringUtil;

public class Test {

    public static void main(String[] args) {
        String whoAsking = "Walter White";
        String answer = StringUtil.sayMyName(whoAsking);
        System.out.println(answer);
    }

}
