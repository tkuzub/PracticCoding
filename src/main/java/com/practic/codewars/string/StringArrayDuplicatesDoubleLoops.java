package com.practic.codewars.string;
/*In this Kata, you will be given an array of strings and your task is to remove all consecutive duplicate
letters from each string in the array.

For example:

dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].

dup(["kelless","keenness"]) = ["keles","kenes"].

Strings will be lowercase only, no spaces. See test cases for more examples.*/

import java.util.ArrayList;
import java.util.List;

public class StringArrayDuplicatesDoubleLoops {
    public String[] dup(String[] arr){
        List<String> list = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        for (String string : arr) {
            removeDuplicates(list, resultList, string);
        }
        return resultList.toArray(String[]::new);
    }

    private void removeDuplicates(List<String> list, List<String> resultList, String string) {
        list.clear();
        for (int index = 0; index < string.length() - 1; index++) {
            if (string.charAt(index) != string.charAt(index + 1)) {
                list.add(string.substring(index, index + 1));
            }
        }
        String resultString = String.join("", list);
        resultList.add(resultString + string.substring(string.length() - 1));
    }
}
