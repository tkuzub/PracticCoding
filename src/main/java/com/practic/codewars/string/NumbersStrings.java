package com.practic.codewars.string;

import java.util.Arrays;

/**
 * In this Kata, you will be given a string that has lowercase letters and numbers. Your task is to compare the number
 * groupings and return the largest number. Numbers will not have leading zeros.
 *
 * For example, solve("gh12cdy695m1") = 695, because this is the largest of all number groupings.
 *
 * Good luck!
 *
 * Please also try Simple remove duplicates
 */
public class NumbersStrings {
    public int solve(String s) {
        return Arrays.stream(s.split("[a-z]+")).filter(str -> !str.isEmpty()).
                mapToInt(Integer::parseInt).
                max().
                orElse(0);
    }
}