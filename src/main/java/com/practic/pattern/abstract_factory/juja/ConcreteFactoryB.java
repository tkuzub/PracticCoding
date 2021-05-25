package com.practic.pattern.abstract_factory.juja;

public class ConcreteFactoryB implements AbstractFactory {
    @Override
    public Product1 createProduct1() {
        return new ConcreteProductB1();
    }

    @Override
    public Product2 createProduct2() {
        return new ConcreteProductB2();
    }

    @Override
    public Product3 createProduct3() {
        return new ConcreteProductB3();
    }
}
