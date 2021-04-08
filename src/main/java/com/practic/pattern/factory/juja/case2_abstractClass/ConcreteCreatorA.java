package com.practic.pattern.factory.juja.case2_abstractClass;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
