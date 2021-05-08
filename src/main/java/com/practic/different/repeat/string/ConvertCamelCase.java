package com.practic.different.repeat.string;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was capitalized
 * (known as Upper Camel Case, also often referred to as Pascal case).
 *
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */
public class ConvertCamelCase {
    public String toCamelCase(String s){
        String result = Arrays.stream(s.split("[-|_]+")).
                map(str -> Character.toLowerCase(str.charAt(0)) + str.substring(1)).
                collect(Collectors.joining(""));
        return result.replaceAll(" ", "");
    }
}
