package com.practic.pattern.factory.juja.case1_interface;

public class ConcreteCreatorA implements Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
