package org.example;

import java.util.Arrays;

public class TotalPoints {
    public static int points(String[] games) {
        return Arrays.stream(games)
                .mapToInt(score -> Integer.parseInt(score.split(":")[0]) - Integer.parseInt(score.split(":")[1]))
                .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
                .sum();
    }
}
//    int res = 0;
//        for (var game : games) {
//                var x = game.charAt(0);
//                var y = game.charAt(2);
//
//                if (x > y) {
//                res += 3;
//                } else if (x == y) {
//                res += 1;
//                }
//                }
//                return res;