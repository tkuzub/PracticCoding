package com.practic.pattern.strategy.bookGOF;

public class DuckLauncher {
    public static void main(String[] args) {

        Duck readHeadDuck = new ReadHeadDuck(new FlyWithWings(), new Quack());
        readHeadDuck.execute();

        System.out.println("=============");

        readHeadDuck.setFLyBehavior(new FlyLikeRocket());
        readHeadDuck.execute();
    }
}
