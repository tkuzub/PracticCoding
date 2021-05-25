package com.practic.pattern.abstract_factory.juja;

public class ConcreteFactoryA implements AbstractFactory {
    @Override
    public Product1 createProduct1() {
        return new ConcreteProductA1();
    }

    @Override
    public Product2 createProduct2() {
        return new ConcreteProductA2();
    }

    @Override
    public Product3 createProduct3() {
        return new ConcreteProductA3();
    }
}
