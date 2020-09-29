package com.practic.codewars.arrays;
/*
You get an array of different numbers to sum up. But there is one problem, those numbers all have different bases.
 For example:

You get an array of BasedNumbers as an input:

public class BasedNumbers{
  String number;
  int base;
}

[{number:"101", base:16}, {number:"7640", base:8}, {number:"1", base:9}]
The output should be the sum as an integer value with a base of 10, so according to the example this would be:

4258

A few more examples:
[{number:"101", base:2}, {number:"10", base:8}] --> 13
[{number:"ABC", base:16}, {number:"11", base:2}] --> 2751
 */
public class ArraySumminator {
    static class BasedNumbers {
        String number;
        int base;

        public BasedNumbers(String number, int base) {
            this.number = number;
            this.base = base;
        }
    }


    public long sumItUp(BasedNumbers[] numbersWithBases) {
        int result = 0;

        for (BasedNumbers numbers : numbersWithBases) {
            switch (numbers.base) {
                case 2:
                    result += Integer.parseInt(numbers.number, 2);
                    break;
                case 8:
                    result += Integer.parseInt(numbers.number, 8);
                    break;
                case 16:
                    result += Integer.parseInt(numbers.number, 16);
                    break;
                default:
                    result += Integer.parseInt(numbers.number);
            }
        }
        return result;
    }
}