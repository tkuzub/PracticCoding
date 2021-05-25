package com.practic.pattern.abstract_factory.juja;

public class ConcreteProductB1 implements Product1 {
    @Override
    public String process(String data) {
        return String.format("changedB: %s", data);
    }
}
