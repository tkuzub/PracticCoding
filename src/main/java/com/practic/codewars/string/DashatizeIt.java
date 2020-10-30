/*Given a number, return a string with dash'-'marks before and after each odd integer, but do not
begin or end the string with a dash mark.

Example:

dashatize(274) -> '2-7-4'
dashatize(6815) -> '68-1-5'
*/

package com.practic.codewars.string;

public class DashatizeIt {
    public String dashatize(int num) {
        String value = String.valueOf(num);
        String newString;

        if (value.startsWith("-")) {
            newString = value.substring(1);
        } else {
            newString = value;
        }

        StringBuilder result = new StringBuilder();
        String[] split = newString.split("");
        int index = 0;

        if (Integer.parseInt(split[index]) % 2 == 1) {
            result.append(split[index]);
            result.append("-");
        } else {
            result.append(split[index]);
        }

        for (index = 1; index < split.length; index++) {
            String data = split[index];
            if (Integer.parseInt(data) % 2 == 1) {
                if (result.substring(result.length() - 1).equals("-")) {
                    result.append(data);
                    result.append("-");
                } else {
                    result.append("-");
                    result.append(data);
                    result.append("-");
                }
            } else {
                result.append(data);
            }
        }

        if (result.substring(result.length() - 1).equals("-")) {
            return result.substring(0, result.length() - 1);
        }

        return result.toString();
    }
}
