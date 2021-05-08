/*Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

Patrick Feeney => P.F*/

package com.practic.different.repeat.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWords {
    public String abbrevName(String name) {
        return Arrays.stream(name.toUpperCase().
                split(" ")).
                map(s -> s.substring(0, 1)).
                collect(Collectors.joining("."));
    }
}
