/*You have to create a method "compoundArray" which should take as input two int arrays of different
length and return one int array with numbers of both arrays shuffled one by one.

Input - {1,2,3,4,5,6} and {9,8,7,6}
Output - {1,9,2,8,3,7,4,6,5,6}*/

package com.practic.codewars.arrays;

public class CompoundArray {
    public int[] compoundArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int index = 0;

        for (int j = 0; index < result.length; j++) {
            if (j < a.length) result[index++] = a[j];
            if (j < b.length) result[index++] = b[j];
        }
        return result;
    }
}
