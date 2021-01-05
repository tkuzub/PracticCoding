/*For every good kata idea there seem to be quite a few bad ones!

In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'.
If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'.
If there are no good ideas, as is often the case, return 'Fail!'.*/

package com.practic.codewars.string;

import java.util.Arrays;

public class WellIdeas {
    public String well(String[] x) {
        long count = Arrays.stream(x).filter(s -> s.equals("good")).count();

        return (count == 0) ? "Fail!" : (count > 2) ? "I smell a series!" : "Publish!";
    }
}
