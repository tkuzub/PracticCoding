package com.practic.codewars.functional.other;

import java.util.function.UnaryOperator;

/**
 * Create a function which answers the question "Are you playing banjo?".
 * If your name starts with the letter "R" or lower case "r", you are playing banjo!
 *
 * The function takes a name as its only argument, and returns one of the following strings:
 *
 * name + " plays banjo"
 * name + " does not play banjo"
 */

public class Banjo {
    public String areYouPlayingBanjo(String name) {
        UnaryOperator<String> function = s -> {
            switch (s.substring(0, 1)) {
                case "R":
                    return s + " plays banjo";
                case "r":
                    return s + " play banjo";
            }
            return s + " does not play banjo";
        };
      return   function.apply(name);
    }
}
