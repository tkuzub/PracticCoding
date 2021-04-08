package com.practic.pattern.factory.juja.case2_abstractClass;

public class ConcreteProductA implements Product {
    private String config;

    @Override
    public String process(String data) {
        return String.format("ConcreteProductA:[%s] %s", config, data);
    }

    @Override
    public void setup(String config) {
        this.config = config;
    }
}
