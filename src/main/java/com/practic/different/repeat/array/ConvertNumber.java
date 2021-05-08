package com.practic.different.repeat.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert number to reversed array of digits
 * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 *
 * Example:
 * 348597 => [7,9,5,8,4,3]
 */
public class ConvertNumber {
    public int[] digitize(long n) {
        List<Long> listNumber = new ArrayList<>();
        while (n != 0) {
            long digit = n % 10;
            listNumber.add(digit);
            n /= 10;
        }

        return listNumber.stream().mapToInt(Long::intValue).toArray();
    }
}
