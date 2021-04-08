package com.practic.pattern.factory.juja.case2_abstractClass;


public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreatorA();
//        Creator creator = new ConcreteCreatorB();

        Client client = new Client();

        //обрабатываем данные и получаем на вход creator

        String result = client.process("data", "config", creator);
        System.out.println(result);
    }
}
