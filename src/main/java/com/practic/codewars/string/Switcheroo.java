package com.practic.codewars.string;

/**
 * Given a string made up of letters a, b, and/or c, switch the position of letters a and b
 * (change a to b and vice versa). Leave any incidence of c untouched.
 *
 * Example:
 *
 * 'acb' --> 'bca'
 * 'aabacbaa' --> 'bbabcabb'
 */
public class Switcheroo {
    public String switcheroo(String x){
        return x.replaceAll("a", "B").replaceAll("b", "a").replaceAll("B","b");
    }
}
