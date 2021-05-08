/*Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.*/

package com.practic.different.repeat.string;

import java.util.Arrays;

public class Vowels {
    public int getCount(String str) {
        return (int)Arrays.stream(str.split("")).filter(s -> s.matches("[aoieu]+")).count();
    }
}
