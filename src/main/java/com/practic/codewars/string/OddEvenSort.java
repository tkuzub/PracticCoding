package com.practic.codewars.string;

public class OddEvenSort {
    public String sortMyString(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        char[] chars = s.toCharArray();
        for (int index = 0; index < chars.length; index++) {
            if (index % 2 == 0) {
                even.append(chars[index]);
            }else {
                odd.append(chars[index]);
            }
        }
        return even.toString() + " " + odd.toString();
    }
}
