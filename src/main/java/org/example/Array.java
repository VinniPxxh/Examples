package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Array {
    //Найти первый не повторяющийся элемент в массиве целых чисел

    public static Integer find(int[] arr) {
      Map<Integer, Integer> elements = new LinkedHashMap<>();
      for (Integer el : arr) {
          elements.put(el, elements.getOrDefault(el,0) + 1);
      }
      for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
          if (entry.getValue() == 1) {
              return entry.getKey();
          }
      }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 6, 7, 4, 5};
        System.out.println( find(arr));
    }
}