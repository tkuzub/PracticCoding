package com.practic.stepik.adaptive.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that finds all occurrences of the given substring in the string.
 *
 * Input format:
 * The first line of input contains the original string, the second line contains the substring, the positions of which you should find. The lines consist of Latin characters only.
 *
 * Output format:
 * The return int[] with the indices (indexing starts with zero) of the occurrences of the given substring in the string, separated by a space, or number -1 when the substring is absent.
 *
 * Sample Input 1:
 *
 * abacabadaba
 * aba
 * Sample Output 1:
 *
 * [0, 4, 8]
 * Sample Input 2:
 *
 * aaaa
 * aa
 * Sample Output 2:
 *
 * [0, 1, 2]
 * Sample Input 3:
 *
 * abc
 * d
 * Sample Output 3:
 *
 * [-1]
 */
public class SubstringSample {
    public int[]  givenSubstringInString(String firstStr, String secondStr) {
        List<Integer> list = new ArrayList<>();

        if ((!firstStr.contains(secondStr))) {
            list.add(-1);
        } else {
            for (int index = 0; index < firstStr.length(); index++) {
                if (firstStr.substring(index).startsWith(secondStr)) {
                    list.add(index);
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
