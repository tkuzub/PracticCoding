package com.practic.codewars.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Task
Given an array of integers , Find the minimum sum which is obtained from summing each Two integers product .

Notes
Array/list will always has even size

Input >> Output Examples
minSum({5,4,2,3}) ==> return (22)
Explanation:
The minimum sum obtained from summing each two integers product , 5*2 + 3*4 = 22
minSum({12,6,10,26,3,24}) ==> return (342)
Explanation:
The minimum sum obtained from summing each two integers product , 26*3 + 24*6 + 12*10 = 342
minSum({9,2,8,7,5,4,0,6}) ==> return (74)
Explanation:
The minimum sum obtained from summing each two integers product , 9*0 + 8*2 +7*4 +6*5 = 74
 */
public class MinimumSum {
    public int minSum(int[] passed) {
        if (passed.length % 2 == 1) {
            throw new RuntimeException("invalid length expects an even size of the array, " +
                    "and you entered " + passed.length);
        }
        int[] data = passed.clone();
        Arrays.sort(data);

        return IntStream.range(0, data.length / 2).map(index -> data[index] * data[data.length - 1 - index]).sum();

    }
}
