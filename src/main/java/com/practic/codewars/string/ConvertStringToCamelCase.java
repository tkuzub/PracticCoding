package com.practic.codewars.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was capitalized
 * (known as Upper Camel Case, also often referred to as Pascal case).
 *
 * toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
 * toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
 */
public class ConvertStringToCamelCase {
    public String toCamelCase(String string) {
        List<String> listString = Arrays.asList(string.split("[_|-]"));
        return listString.get(0) + listString.
                stream().skip(1).map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).collect(Collectors.joining());
    }
}