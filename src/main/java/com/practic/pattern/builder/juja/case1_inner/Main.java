package com.practic.pattern.builder.juja.case1_inner;

public class Main {
    public static void main(String[] args) {

        Product object = new Product.Builder() {{
            field1 = "data1";
            field2 = "data2";
            field3 = "data3";
        }}.build();

        System.out.println(object);
    }
}
