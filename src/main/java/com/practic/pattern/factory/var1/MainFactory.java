package com.practic.pattern.factory.var1;

public class MainFactory {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car audy = factory.create("audy");
        audy.drive();
    }
}

interface Car {
    void drive();
}

class Audy implements Car {

    @Override
    public void drive() {
        System.out.println("drive Audy");
    }

    @Override
    public String toString() {
        return "Audy";
    }
}

class Toyota implements Car {

    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class Factory {
    public Car create(String model) {
        switch (model) {
            case "audy":
                return new Audy();
            case "toyota":
                return new Toyota();
            default:
                return null;
        }

    }
}