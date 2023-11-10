package org.example;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class StringSplit {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s = s + "_";
        }
        return s.split("(?<=\\G.{2})");
    }

//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution("asdas")));
//    }
}
