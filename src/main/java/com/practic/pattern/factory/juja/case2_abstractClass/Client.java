package com.practic.pattern.factory.juja.case2_abstractClass;

public class Client {

    public String process(String data, String config, Creator creator) {
       Product product = creator.create(config);
        return product.process(data);
    }
}
