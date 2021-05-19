package com.practic.codewars.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sentence {
    public static void main(String[] args) {
        String sentence = "Тарас Рома Боб Ян";
        String result = Arrays.stream(sentence.split(" ")).sorted().collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
