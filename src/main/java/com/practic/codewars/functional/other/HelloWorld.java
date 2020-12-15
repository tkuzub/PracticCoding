package com.practic.codewars.functional.other;

import java.util.function.Supplier;

public class HelloWorld {
    public String greet() {
        Supplier<String> fun = () -> "hello world!";
        return fun.get();
    }
}
