/*Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'*/

package com.practic.indigo.string;

public class ReversedStrings {
    public String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
