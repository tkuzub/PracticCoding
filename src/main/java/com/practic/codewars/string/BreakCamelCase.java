/*Complete the solution so that the function will break up camel casing, using a space between words.

Example
solution("camelCasing")  ==  "camel Casing"
*/

package com.practic.codewars.string;

public class BreakCamelCase {
    public String camelCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                result.append(" ").append(input.charAt(i));
            } else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
    /*return input.replaceAll("([A-Z])", " $1");*/
}
