package com.practic.pattern.factory.juja.case3_switchCase;

public class ConcreteCreator implements Creator {
    @Override
    public Product createProduct(String productName) {
        if (productName.equals("Product A")) {
            return new ConcreteProductA();
        } else if (productName.equals("Product B")) {
            return new ConcreteProductB();
        } else {
            throw new UnsupportedOperationException("Unexpected product: " + productName);
        }
    }
}
