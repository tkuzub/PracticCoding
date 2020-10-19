/*
  You have an array of numbers.
  Your task is to sort ascending odd numbers but even numbers must be on their places.

  Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.

  Example

  sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 */
package com.practic.codewars.functional.other;

import java.util.ArrayList;
import java.util.List;

public class SortOdd {
    public int[] sortArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 1) {
                list.add(num);
            }
        }

        list.sort(Integer::compareTo);

        int currentIndex = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 1) {
                array[index] = list.get(currentIndex++);
            }
        }
        return array;
    }
}
