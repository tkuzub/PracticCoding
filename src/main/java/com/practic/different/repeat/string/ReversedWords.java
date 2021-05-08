/*Complete the solution so that it reverses all of the words within the string passed in.

Example:

ReverseWords.reverseWords("The greatest victory is that which requires no battle");
// should return "battle no requires which that is victory greatest The"*/

package com.practic.different.repeat.string;

import java.util.Arrays;

public class ReversedWords {
    public String reverseWords(String str){
        return Arrays.stream(str.split(" ")).reduce((x, y) -> y + " " + x).orElse("");
    }
}
