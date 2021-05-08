/*Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.*/

package com.practic.different.repeat.string;

public class VowelsVar2 {
    public int getCount(String str) {
        String vowels = "aoieu";
        return (int)str.chars().filter(c -> vowels.indexOf(c) != -1).count();
    }
}
