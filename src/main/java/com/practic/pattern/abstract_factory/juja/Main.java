package com.practic.pattern.abstract_factory.juja;

public class Main {
    public static void main(String[] args) {
    // Где-то в системе не на стороне клиента создается фектори
//        AbstractFactory factory = new ConcreteFactoryA();
     AbstractFactory factory = new ConcreteFactoryB();

    // наш клиент
        Client client = new Client();

        Product2 result = client.process(factory);

        System.out.println(result);
    // printA: changedA: oneA - changedA: anotherA
    // printB: changedB: oneB - changedB: anotherB
    }
}
