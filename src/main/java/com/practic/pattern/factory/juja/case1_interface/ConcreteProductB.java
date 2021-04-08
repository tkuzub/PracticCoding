package com.practic.pattern.factory.juja.case1_interface;

public class ConcreteProductB implements Product {
    @Override
    public String process(String data) {
        return String.format("ConcreteProductB: %s", data);
    }
}
