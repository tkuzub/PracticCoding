package com.practic.different.repeat.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Task
 * You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even
 * numbers at their original positions.
 *
 * Examples
 * [7, 1]  =>  [1, 7]
 * [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
 * [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
 */
public class SortOdd {
    public int[] sortArray(int[] array) {
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                odd.add(array[i]);
                array[i] = -1;
            }
        }

        Collections.sort(odd);
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                array[i] = odd.get(index++);
            }
        }
        return array;
    }
}

/* // Sort the odd numbers only
    final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

    // Then merge them back into original array
    for (int j = 0, s = 0; j < array.length; j++) {
      if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
    }

    return array;*/

/*OfInt sortedOdds = IntStream
        .of(array)
        .filter(i -> i % 2 == 1)
        .sorted()
        .iterator();

    return IntStream
        .of(array)
        .map(i -> i % 2 == 0 ? i : sortedOdds.nextInt())
        .toArray();
      }*/