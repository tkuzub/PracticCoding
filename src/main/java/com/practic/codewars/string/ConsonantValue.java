/*
Given a lowercase string that has alphabetic characters only and no spaces, return the highest value of
consonant substrings. Consonants are any letters of the alphabet except "aeiou".

We shall assign the following values: a = 1, b = 2, c = 3, .... z = 26.

For example, for the word "zodiacs", let's cross out the vowels. We get: "z o d ia cs"

-- The consonant substrings are: "z", "d" and "cs" and the values are z = 26, d = 4 and cs = 3 + 19 = 22.
The highest is 26.
solve("zodiacs") = 26

For the word "strength", solve("strength") = 57
-- The consonant substrings are: "str" and "ngth" with values "str" = 19
 */

package com.practic.codewars.string;

import java.util.Arrays;
import java.util.function.Function;

public class ConsonantValue {
    public int solve(final String s) {

        Function<String, Integer> function = ch -> {
            switch (ch.length()) {
                case 0:
                    return 0;
                case 1:
                    return ch.charAt(0) - 96;
                default:
                    int value = 0;
                    for (int i = 0; i < ch.length(); i++) {
                        value += ch.substring(i, i + 1).charAt(0) - 96;
                    }
                    return value;
            }
        };

        return Arrays.stream(s.split("[aeiou]")).map(function).max(Integer::compareTo).orElse(0);
    }
}

