package com.practic.pattern.abstract_factory.juja;

public class ConcreteProductA3 implements Product3 {
    @Override
    public String getOne() {
        return "oneA";
    }

    @Override
    public String getAnother() {
        return "anotherA";
    }

    @Override
    public String getSomething() {
        return "somethingA";
    }
}
