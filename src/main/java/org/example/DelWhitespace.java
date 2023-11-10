package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DelWhitespace {

    /*
    Напишите функцию, которая удаляет пробелы из строки, а затем возвращает результирующую строку.

                    Примеры:

                    Input -> Output
                    "8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
                    "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
                    "8aaaaa dddd r     " -> "8aaaaaddddr"
     */
    public static String noSpace(final String x) {
        return x.replaceAll("\\s+", "");
    }
}
