package com.practic.indigo.array;

import java.util.Arrays;

public class MaxMinArrays {
    public int[] solve (int[] arr){
        int index = 0;
        int[] result = new int[arr.length];

        Arrays.sort(arr);

        int i;
        for (i = 0; i < arr.length / 2; i++) {
            result[index++] = arr[arr.length - i - 1];
            result[index++] = arr[i];
        }

        if (arr.length % 2 == 1) {
            result[index] = arr[i];
        }
        return result;
    }
}
