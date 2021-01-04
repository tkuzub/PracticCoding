/*You have to create a method "compoundArray" which should take as input two int arrays of different
length and return one int array with numbers of both arrays shuffled one by one.

Input - {1,2,3,4,5,6} and {9,8,7,6}
Output - {1,9,2,8,3,7,4,6,5,6}*/

package com.practic.codewars.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompoundArray {
    public int[] compoundArray(int[] a, int[] b) {
        List<Integer> data = new ArrayList<>();

        int i;
        for (i = 0; i < a.length; i++) {
            data.add(a[i]);
            IntStream.range(i, b.length).findFirst().ifPresent(j -> data.add(b[j]));
        }

        if (a.length < b.length) {
            List<Integer> dataList = IntStream.
                    range(i, b.length).mapToObj(value -> b[value]).
                    collect(Collectors.toCollection(ArrayList::new));
            data.addAll(dataList);
        }

        return data.stream().mapToInt(Integer::intValue).toArray();
    }
}
