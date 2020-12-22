/*You have to create a method "compoundArray" which should take as input two int arrays of different
length and return one int array with numbers of both arrays shuffled one by one.

Input - {1,2,3,4,5,6} and {9,8,7,6}
Output - {1,9,2,8,3,7,4,6,5,6}*/

package com.practic.codewars.arrays;

import java.util.ArrayList;
import java.util.List;

public class CompoundArray {
    public int[] compoundArray(int[] a, int[] b){
        List<Integer> data = new ArrayList<>();


        return getResult(data);
    }

    private int[] getResult(List<Integer> data) {
        int[] result = new int[data.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = data.get(i);
        }
        return result;
    }
}
