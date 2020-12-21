package com.practic.codewars.string;

import java.math.BigInteger;

public class HowCable {

    public int calculateLength(String cable){
        int count = 0;
        for (int index = 0; index < cable.length(); index++) {
            if (cable.charAt(index) == '(') {
                return calculateLength(cable.substring(1));
            }

            if (cable.charAt(index) == '-') {
                count += 1;
            } else if (cable.charAt(index) == '_') {
                count += 2;
            } else if(cable.charAt(index) == '=') {
                count += 3;
            }
        }

        return  count;
    }
}
