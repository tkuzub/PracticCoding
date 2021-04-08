package com.practic.pattern.factory.juja.case3_switchCase;

public class ConcreteProductB implements Product {
    @Override
    public String process(String data) {
        return String.format("ConcreteProductB: %s", data);
    }
}
