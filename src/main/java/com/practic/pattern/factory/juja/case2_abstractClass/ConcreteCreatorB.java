package com.practic.pattern.factory.juja.case2_abstractClass;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
