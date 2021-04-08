package com.practic.pattern.factory.juja.case1_interface;

public class ConcreteCreatorB implements Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
