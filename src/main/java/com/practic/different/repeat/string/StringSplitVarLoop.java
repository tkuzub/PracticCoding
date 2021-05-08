/*Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number
of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}*/

package com.practic.different.repeat.string;

import java.util.ArrayList;
import java.util.List;

public class StringSplitVarLoop {
    public String[] solution(String s) {
        if (s.length() % 2 == 1) s += "_";

        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i += 2) {
            result.add(s.substring(i, i + 2));
        }
        return result.toArray(String[]::new);
    }
}
