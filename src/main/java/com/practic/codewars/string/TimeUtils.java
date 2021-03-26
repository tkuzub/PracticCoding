package com.practic.codewars.string;

/**
 * Given time in seconds, return formatted string, as shown in following example:
 *
 * Example:
 * Input: 90061 sec
 *
 * Output: 1 1 1 1
 *
 * e.g
 *
 * 90061 sec: 1 1 1 1 (1 day, 1 hour, 1 min and 1 seconds)
 * 93784 sec: 1 2 3 4 (1 day, 2 hours, 3 mins, 4 seconds)
 * Useful conversions:
 * 60 sec = 1 min
 * 60 min = 1 hour
 * 24 hour = 1 day
 * Please see included test case for an example.
 */
public class TimeUtils {
    public String convertTime(int timeDiff) {
        int cheek;
        String result = "";
        cheek = timeDiff / (3600 * 24);


        if (cheek != 0) {
            result += cheek + " ";
            timeDiff %= cheek * timeDiff / (3600 * 24);
        } else {
            result += "0 ";
        }
        cheek = timeDiff / 3600;

        if (cheek != 0) {
            result += cheek + " ";
            timeDiff %= cheek * timeDiff / 3600;
        } else {
            result += "0 ";
        }
        cheek = timeDiff / 60;

        if (cheek != 0) {
            result += cheek + " ";
            timeDiff %= cheek * timeDiff / 60;
        } else {
            result += "0 ";
        }
        result += timeDiff;
        return result;
    }
}
