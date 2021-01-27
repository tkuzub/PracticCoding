/*Your task is to sum the differences between consecutive pairs in the array in descending order.

For example:

sumOfDifferences([2, 1, 10])
Returns 9

Descending order: [10, 2, 1]

Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9

If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell).*/

package com.practic.indigo.array;

import java.util.Collections;
import java.util.stream.IntStream;

public class SumDifferentArray {
    public int sumOfDifferences(int[] arr) {
        int sum = 0;

        int[] array = IntStream.of(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();

        return IntStream.range(0, array.length - 1).map(i -> array[i] - array[i + 1]).sum();
    }
}
