/*Input a single character and change its register. That is, if the lowercase letter has been entered – make it
uppercase, and vice versa. Characters that are not Latin ones need to stay unchanged.*/
package com.practic.stepik.adaptive.task1;

import java.util.Scanner;

public class ChangeRegister {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String result;
        String ch = in.nextLine();

        if (ch.matches("\\p{IsLatin}")) {
            if (Character.isUpperCase(ch.charAt(0))) {
                result = ch.toLowerCase();
            } else {
                result = ch.toUpperCase();
            }
        } else {
            result = ch;
        }

        System.out.println(result);
    }
}
