/*
* You will be given list of names of people who are standing in circle. While counting off by twos in circle,
* each second leaves, until only one person is left standing. Return the list of people in order of their leaving.

Example:

{Bob, Lorna, Desiree, Melissa, Josh}
{Bob, Desiree, Melissa, Josh} - Lorna leaves
{Bob, Desiree, Josh} - Melissa leaves
{Desiree, Josh} - Bob leaves
{Desiree} - Josh leaves
The resulting list that should be returned is {Lorna, Melissa, Bob, Josh}*/

package com.practic.codewars.list.kata;

import java.util.ArrayList;
import java.util.List;

public class CircleOfPeople {
    public List<String> crossingOut(List<String> list) {
        List<String> result = new ArrayList<>();
        int currentIndex = 0;
        while (list.size() != 1) {
            for (int index = 0; index < list.size(); index++) {
                if (currentIndex % 2 == 1) {
                    result.add(list.remove(index));
                    index--;
                }
                currentIndex++;
            }
        }
        return result;
    }
}
