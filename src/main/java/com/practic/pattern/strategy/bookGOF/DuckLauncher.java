package com.practic.pattern.strategy.bookGOF;

public class DuckLauncher {
    public static void main(String[] args) {

        Duck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.setFLyBehavior(new FlyWithWings());
        readHeadDuck.setQuackBehavior(new Quack());

        readHeadDuck.performFly();
        readHeadDuck.performQuack();

        System.out.println("=================");

        readHeadDuck.setFLyBehavior(new FlyLikeRocket());
        readHeadDuck.performFly();
    }
}
