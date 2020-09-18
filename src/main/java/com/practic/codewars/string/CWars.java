package com.practic.codewars.string;

/**
 * Normally we have firstname, middle and the last name but there may be more than one word in a name like a South Indian one.
 * Similar to those kinda names we need to initialize the names.
 * See the pattern below:
 *
 * initials('code wars') => returns C.Wars
 * initials('Barack Hussain obama') => returns B.H.Obama
 */
public class CWars {
    public String initials(String name){
        String[] data = name.split(" ");
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < data.length - 1; index++) {
          result.append(data[index].substring(0, 1).toUpperCase()).append(".");
        }
        result.append(data[data.length - 1].substring(0, 1).toUpperCase());
        result.append(data[data.length - 1].substring(1));

        return result.toString();
    }
}
