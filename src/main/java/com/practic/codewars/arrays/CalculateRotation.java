/*Write a function that receives two strings and returns n, where n is equal to the number of characters we should shift the first string forward to match the second.

For instance, take the strings "fatigue" and "tiguefa". In this case, the first string has been rotated 5 characters
forward to produce the second string, so 5 would be returned.

If the second string isn't a valid rotation of the first string, the method returns -1.
Examples:
``` "coffee", "eecoff" => 2 "eecoff", "coffee" => 4 "moose", "Moose" => -1 "isn't", "'tisn" => 2 "Esham", "Esham" => 0
"dog", "god" => -1 ```
For Swift, your function should return an Int?. So rather than returning -1 when the second string isn't a valid
rotation of the first, return nil.

shiftedDiff("coffee", "eecoff") => 2
shiftedDiff("eecoff", "coffee") => 4
shiftedDiff("moose", "Moose") => nil
shiftedDiff("isn't", "'tisn") => 2
shiftedDiff("Esham", "Esham") => 0
shiftedDiff("dog", "god") => nil*/
package com.practic.codewars.arrays;

public class CalculateRotation {
    public int shiftedDiff(String first, String second) {

        if (first.equals(second)) {
            return 0;
        }

        int count = 0;
        for (int index = 0; index < second.length() - 1; index++) {
            String x = second.substring(index + 1);
            String y = x + second.substring(0, index + 1);
            if (!y.startsWith(first)) {
                count++;
            } else {
                count++;
                break;
            }
        }

        if (count == first.length() - 1) {
            return -1;
        }

        return count;
    }
}
