package org.example;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FakeBinary {
    /*
     Учитывая строку цифр, вы должны заменить любую цифру ниже 5 на "0", а любую цифру 5 и выше на "1". Верните результирующую строку.
     */
    public static String fakeBin(String numberString) {
////                return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
//        final char[] number = numberString.toCharArray();
//        for (int i = 0; i < number.length && number[i] == number[i]; i++) {
//            if (number[i] < '5') {
//                number[i] = '0';
//            } else {
//                number[i] = '1';
//            }
//        }
//        return new String(number);

        return String.join("", Arrays.stream(numberString.split(""))
                .map(e -> Integer.parseInt(e) < 5 ? "0" : "1")
                .toArray(String[]::new));
    }
}

