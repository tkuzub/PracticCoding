/*
* In Haskell, Monads are simple containers, or even 'box-like' datastructures, of which lists are included,
* which can respond to certain functions, which are defined in the Monad typeclass. (To put it simply!)

In this kata, you must implement the Bind function for lists, or arrays. In haskell, the function is represented
* by >>=, but we'll just call it bind.

Essentially, bind should map the array with the function given, and then flatten it one time. Don't manipulate the
* original array; make you function pure: without side-effects, so that no variables are edited whilst the function is carried out.
* */
package com.practic.codewars.functional.other;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Binder<T, I> {
    public List<I> bind(List<T> list, Function<T, List<I>> func) {
        return list.stream().
                flatMap(t -> Stream.of(func.apply(t))).
                flatMap(List::stream).
                collect(Collectors.toList());
    }
}