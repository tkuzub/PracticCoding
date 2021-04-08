package com.practic.pattern.factory.juja.case3_switchCase;


public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
//        Creator creator = new ConcreteCreatorB();

        Client client = new Client();
        //обрабатываем данные и получаем на вход creator

        String result = client.process(creator, "data",  "Product A");
        System.out.println(result);
    }
}
