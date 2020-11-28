/*Input a single character and change its register. That is, if the lowercase letter has been entered – make it
uppercase, and vice versa. Characters that are not Latin ones need to stay unchanged.*/
package com.practic.stepik.adaptive.task1;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ChangeRegister {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Predicate<String> f1 = s -> s.matches("\\p{IsLatin}");
        UnaryOperator<String> f2 = s -> (Character.isUpperCase(s.charAt(0)) ? s.toLowerCase() : s.toUpperCase());

        System.out.println(f1.test(str) ? f2.apply(str) : str);
    }
}

