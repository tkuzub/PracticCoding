/*Complete the solution so that the function will break up camel casing, using a space between words.

Example
solution("camelCasing")  ==  "camel Casing"
*/

package com.practic.codewars.string;

import java.util.stream.Collectors;

public class BreakCamelCaseStream extends BreakCamelCase{
    public String camelCase(String input) {
        return input.chars().
                mapToObj(ch -> Character.isUpperCase(ch) ? " " + (char)ch : String.valueOf((char)ch)).
                collect(Collectors.joining());
    }
}
