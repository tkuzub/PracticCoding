package com.practic.pattern.abstract_factory.juja;

public class ConcreteProductB3 implements Product3 {

    @Override
    public String getOne() {
        return "oneB";
    }

    @Override
    public String getAnother() {
        return "anotherB";
    }

    @Override
    public String getSomething() {
        return "somethingB";
    }
}
