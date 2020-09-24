package com.practic.codewars.string;
/*In this Kata, you will be given an array of strings and your task is to remove all consecutive duplicate
letters from each string in the array.

For example:

dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].

dup(["kelless","keenness"]) = ["keles","kenes"].

Strings will be lowercase only, no spaces. See test cases for more examples.*/

import java.util.Arrays;

public class StringArrayDuplicates {
    public String[] dup(String[] arr){
        return Arrays.stream(arr).
                map(str -> str.replaceAll("(.)\\1{1,}", "$1")).
                toArray(String[]::new);
    }
}
