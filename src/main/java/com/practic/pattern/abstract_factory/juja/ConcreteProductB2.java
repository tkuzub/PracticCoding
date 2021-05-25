package com.practic.pattern.abstract_factory.juja;

public class ConcreteProductB2 implements Product2 {
    private String one;
    private String another;

    @Override
    public void setOne(String data) {
        this.one = data;
    }

    @Override
    public void setAnother(String data) {
        this.another = data;
    }

    @Override
    public String toString() {
        return "printB: " + one + " - " + another;
    }
}
