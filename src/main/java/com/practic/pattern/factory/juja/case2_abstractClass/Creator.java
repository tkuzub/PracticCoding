package com.practic.pattern.factory.juja.case2_abstractClass;

public abstract class Creator {
   protected abstract Product factoryMethod();

    public Product create(String config) {
        Product product = factoryMethod();
        product.setup(config);
        return product;
    }
}
