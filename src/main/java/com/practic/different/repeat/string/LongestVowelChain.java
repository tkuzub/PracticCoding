package com.practic.different.repeat.string;

import java.util.Arrays;

/**
 * The vowel substrings in the word codewarriors are o,e,a,io. The longest of these has a length of 2.
 * Given a lowercase string that has alphabetic characters only (both vowels and consonants) and no spaces, return
 * the length of the longest vowel substring. Vowels are any of aeiou.
 *
 * Good luck!
 *
 * If you like substring Katas, please try:
 */
public class LongestVowelChain {
    public int solve(String s){
        return Arrays.stream(s.split("[^aioue]+")).mapToInt(String::length).max().orElse(0);
    }
}
