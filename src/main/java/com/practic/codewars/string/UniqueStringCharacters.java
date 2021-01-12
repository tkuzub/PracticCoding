/*In this Kata, you will be given two strings a and b and your task will be to return the characters that
are not common in the two strings.

For example:

solve("xyab","xzca") = "ybzc"
--The first string has 'yb' which is not in the second string.
--The second string has 'zc' which is not in the first string.
Notice also that you return the characters from the first string concatenated with those from the second string.

More examples in the tests cases.*/

package com.practic.codewars.string;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UniqueStringCharacters {
    public String solve(String a, String b){
        Predicate<String> fun1 = s -> !s.contains(a);
        Predicate<String> fun2 = s -> !s.contains(b);

        String collect = Arrays.stream(a.split("")).filter(fun1).filter(fun2).collect(Collectors.joining());

        return collect;
    }
}
