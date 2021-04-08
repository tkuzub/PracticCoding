package com.practic.pattern.factory.juja.case1_interface;


public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreatorA();
//        Creator creator = new ConcreteCreatorB();

        Client client = new Client();

        //обрабатываем данные и получаем на вход creator

        String result = client.process("data", creator);
        System.out.println(result);
    }
}
