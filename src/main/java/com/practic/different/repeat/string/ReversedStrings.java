/*Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'*/

package com.practic.different.repeat.string;

public class ReversedStrings {
    public String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
