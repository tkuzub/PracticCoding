package com.practic.codewars.string;
/**
 * ANTISTRING
 * given an input string str, return a string such that
 *
 * All letters change case
 * All digits are replaced with it's compliment to 9 (0 => 9, 1 => 8...)
 * Each letter is replaced by it's compliment in the alphabet (a => z, B => Y, c => x...)
 * The result is reversed
 * "abcWXY123" => "678bcdXYZ"
 */
public class JomoPipi {
    public  String antiString(String str) {
        StringBuilder resultData = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                int nums = Character.getNumericValue(ch);
                int result = 9 - nums;
                resultData.append(result);
            } else {
                char resultLetter = (char) (187 - (int) ch);
                resultData.append(resultLetter);
            }
        }
        return new StringBuilder(resultData).reverse().toString();
    }
}
