/*Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'*/

package com.practic.different.repeat.string;

public class ReversedStringsVarTwo {
    public String solution(String str) {
        char[] chars = str.toCharArray();

        for (int index = 0; index < chars.length / 2; index++) {
            char temp = chars[index];
            chars[index] = chars[chars.length - index - 1];
            chars[chars.length - index - 1] = temp;
        }
        return new String(chars);
    }
}
