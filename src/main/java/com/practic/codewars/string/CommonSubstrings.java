package com.practic.codewars.string;

import java.util.stream.IntStream;

public class CommonSubstrings {
    public boolean SubstringTest(String str1, String str2) {
        return IntStream.range(0, str2.length() - 1).
                anyMatch(index -> str1.contains(str2.substring(index)));
    }
}
