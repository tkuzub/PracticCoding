package com.practic.pattern.builder.juja.case0_classic;

public abstract class Builder {
    protected Product product;

    public void buildPart1() {
        product = new Product();
    }

    public Product getProduct() {
        return product;
    }

    protected abstract void buildPart2();
    protected abstract void buildPart3();
    protected abstract void buildPart4();
}
