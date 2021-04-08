package com.practic.pattern.factory.juja.case3_switchCase;

public class ConcreteProductA implements Product {
    @Override
    public String process(String data) {
        return String.format("ConcreteProductA: %s", data);
    }
}
