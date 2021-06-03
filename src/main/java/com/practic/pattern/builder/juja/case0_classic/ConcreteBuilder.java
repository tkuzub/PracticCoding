package com.practic.pattern.builder.juja.case0_classic;

public class ConcreteBuilder extends Builder {
    @Override
    protected void buildPart2() {
        product.setString1("data1");
    }

    @Override
    protected void buildPart3() {
        product.setString2("data2");
    }

    @Override
    protected void buildPart4() {
        product.setString3("data3");
    }
}
