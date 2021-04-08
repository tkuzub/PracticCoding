package com.practic.pattern.factory.juja.case3_switchCase;

public class Client {

    public String process( Creator creator, String data, String productName) {
       Product product = creator.createProduct(productName);

       //тут может быть всё что угодно

        return product.process(data);
    }
}
