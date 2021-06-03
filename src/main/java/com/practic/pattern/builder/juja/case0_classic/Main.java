package com.practic.pattern.builder.juja.case0_classic;

public class Main {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.construct();

        Product product = director.getProduct();

        System.out.println(product);
    }
}
