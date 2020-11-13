/*
* Compare two strings by comparing the sum of their values (ASCII character code).

For comparing treat all letters as UpperCase
null/NULL/Nil/None should be treated as empty strings
If the string contains other characters than letters, treat the whole string as it would be empty
Your method should return true, if the strings are equal and false if they are not equal.

Examples:
"AD", "BC"  -> equal
"AD", "DD"  -> not equal
"gf", "FG"  -> equal
"zz1", ""   -> equal (both are considered empty)
"ZzZz", "ffPFF" -> equal
"kl", "lz"  -> not equal
null, ""    -> equal*/
package com.practic.codewars.string;

public class SunChars {
    public boolean compare(String s1, String s2) {

        if (s1 == null || !s1.matches("[a-zA-z]+")) {
             s1 = "";
        }

        if (s2 == null || !s2.matches("[a-zA-z]+")) {
            s2 = "";
        }

        return s1.chars().map(Character::toUpperCase).sum() == s2.chars().map(Character::toUpperCase).sum();
    }
}
