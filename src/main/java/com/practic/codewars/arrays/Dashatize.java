package com.practic.codewars.arrays;

public class Dashatize {
    public String dashatize(int num) {
        String result = "";
        String data = String.valueOf(num).replaceAll("-", "").replaceAll("-", "");
        String[] split = data.split("");
        boolean firstInput = true;
        for (int index = 1; index < split.length; index++) {
            if (Integer.parseInt(split[index]) % 2 == 1) {
                if (firstInput) {
                    split[index] = "-" + split[index] + "-";
                    firstInput = false;
                } else {
                    split[index] = split[index] + "-";
                }
            } else {
                firstInput = true;
            }
        }

        String string = String.join("", split);
        result = string.endsWith("-") ? string.substring(0, string.length() - 1) : string;
        return result;
    }
}
