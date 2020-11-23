/*Given an array with exactly 5 strings "a", "b" or "c" (chars in Java, characters in Fortran), check if the array contains three and two of the same values.

Examples
["a", "a", "a", "b", "b"] ==> true  // 3x "a" and 2x "b"
["a", "b", "c", "b", "c"] ==> false // 1x "a", 2x "b" and 2x "c"
["a", "a", "a", "a", "a"] ==> false // 5x "a"*/

package com.practic.codewars.arrays;

import java.util.HashMap;
import java.util.Map;

public class CheckThreeAndTwo {
    public boolean checkThreeAndTwo(char[] chars) {
        Map<Character, Integer> data = new HashMap<>();

        for (Character ch : chars) {
            if (!data.containsKey(ch)) {
                data.put(ch, 1);
            } else {
                data.put(ch, data.get(ch) + 1);
            }
        }
        return data.values().stream().allMatch(n -> n >= 2 && n <= 3);
    }
}
