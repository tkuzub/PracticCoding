package com.practic.different.repeat.string;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Normally we have firstname, middle and the last name but there may be more than one word in a name like a South Indian one.
 *
 * Similar to those kinda names we need to initialize the names.
 *
 * See the pattern below:
 */
public class CWars {
    public String initials(String name){
        String[] data = name.split("[\\s+]");
        return Arrays.stream(data).map(s -> s.substring(0, 1).toUpperCase()).collect(Collectors.joining(".")) +
                data[data.length - 1].substring(1);
    }
}
