package com.practic.different.repeat.array;

/**
 * Simple, remove the spaces from the string, then return the resultant string.
 */
public class NoSpace {
   public String noSpace(String x) {
        return x.replaceAll("\\s+", "");
    }
}
