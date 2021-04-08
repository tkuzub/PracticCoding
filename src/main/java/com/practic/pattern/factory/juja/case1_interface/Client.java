package com.practic.pattern.factory.juja.case1_interface;

public class Client {

    public String process(String data, Creator creator) {
       Product product = creator.factoryMethod();
        return product.process(data);
    }
}
