/*Create a method that accepts an array of names, and returns an array of each name with its first letter
capitalized.*/

package com.practic.codewars.string;

import java.util.Arrays;

public class NameArrayCapping {
    public String[] capMe(String[] strings) {
        return Arrays.stream(strings).
                map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase()).
                toArray(String[]::new);
    }
}
