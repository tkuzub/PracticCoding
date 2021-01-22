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
        int index = 0;
        for (String s : arr) {
            String resultStr = "";
            String NonDublicates = "";
            for (int j = 0; j < s.length(); j++) {
                if (!s.substring(0, 1).contains(NonDublicates)) {
                    resultStr += s.charAt(j);
                } else {
                    NonDublicates += s.charAt(j);
                }
                result[index++] = resultStr;
            }
        }
        return result;
    }
}
