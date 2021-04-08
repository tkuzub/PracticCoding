package com.practic.pattern.factory.juja.case1_interface;

public class ConcreteProductA implements Product {
    @Override
    public String process(String data) {
        return String.format("ConcreteProductA: %s", data);
    }
}
