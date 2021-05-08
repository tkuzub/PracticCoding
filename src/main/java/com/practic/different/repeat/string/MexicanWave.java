/*In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
Rules
 1.  The input string will always be lower case but maybe empty.

 2.  If the character in the string is whitespace then pass over it as if it was an empty seat*/

package com.practic.different.repeat.string;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public String[] wave(String str) {
        List<String> result = new ArrayList<>();

        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);

            if (ch != ' ') {
                result.add(str.substring(0, index) + Character.toUpperCase(ch) + str.substring(index + 1));
            }

        }

        return result.toArray(String[]::new);
    }
}
