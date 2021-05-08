/*Complete the solution so that it reverses all of the words within the string passed in.

Example:

ReverseWords.reverseWords("The greatest victory is that which requires no battle");
// should return "battle no requires which that is victory greatest The"*/

package com.practic.different.repeat.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReversedWordsVarTwo {
    public String reverseWords(String str){
        String[] data = str.split(" ");
        return IntStream.rangeClosed(1, data.length).
                mapToObj(i -> data[data.length - i]).
                collect(Collectors.joining(" "));
    }
}
