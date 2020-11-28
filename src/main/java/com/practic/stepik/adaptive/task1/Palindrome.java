/*Given a string. Find whether it is a palindrome, i.e. it reads the same both left-to-right and right-to-left. Output “yes” if the string is a palindrome and “no” otherwise.

Sample Input:

kayak
Sample Output:

yes
*/
package com.practic.stepik.adaptive.task1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        StringBuilder palindrome = new StringBuilder(input).reverse();

        System.out.println(input.equals(palindrome.toString()) ? "yes" : "no");
    }
}
