/*You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.*/

package com.practic.different.repeat.array;

import java.util.stream.IntStream;

public class Positive {
    public int sum(int[] arr){
        return IntStream.of(arr).filter(n -> n > 0).sum();
    }
}
