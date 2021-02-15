package com.practic.indigo.array;

/**
 * Simple, remove the spaces from the string, then return the resultant string.
 */
public class NoSpace {
   public String noSpace(String x) {
        return x.replaceAll("\\s+", "");
    }
}
