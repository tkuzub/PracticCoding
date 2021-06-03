package com.practic.pattern.builder.juja.case0_classic;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }


    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
        builder.buildPart4();
    }

    public Product getProduct() {
        return builder.getProduct();
    }
}
