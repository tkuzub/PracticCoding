/*
*Write a function

Kata.Vowel2Index("this is my string") == "th3s 6s my str15ng"
Kata.Vowel2Index("Codewars is the best site in the world") == "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"
Your function should be case insensitive to the vowels.
*
**/

package com.practic.codewars.string;

public class TheOldSwitcheroo {
    public String vowel2Index(String s) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < s.length(); index++) {
            if ("aeiouAEIOU".indexOf(s.charAt(index)) == -1) {
                result.append(s.charAt(index));
            } else {
                result.append(index + 1);
            }
        }
        return result.toString();
    }
}
