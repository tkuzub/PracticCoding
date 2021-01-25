/*In this Kata, you will be given an array of strings and your task is to remove all
consecutive duplicate letters from each string in the array.

For example:

dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].

dup(["kelless","keenness"]) = ["keles","kenes"].

Strings will be lowercase only, no spaces. See test cases for more examples.

Good luck!*/

package com.practic.indigo.array;

public class StringDuplicates {
    public String[] dup(String[] arr){
        String[] result = new String[arr.length];

        int currentIndex = 0;
        StringBuilder string;

        for (String str : arr) {
            string = new StringBuilder();
            for (int i = 0; i < str.length() - 1; i++) {
                if (!(str.charAt(i) == str.charAt(i + 1))) {
                    string.append(str.charAt(i));
                }
            }
            if (str.charAt(str.length() - 1) != string.charAt(string.length() - 1)) {
                string.append(str.charAt(str.length() - 1));
            }
            result[currentIndex++] = string.toString();
        }

        return result;
    }
}
