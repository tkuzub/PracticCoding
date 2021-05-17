package com.practic.pattern.strategy.bookGOF;

public class ReadHeadDuck extends Duck {

    public ReadHeadDuck(FLyBehavior fLyBehavior, QuackBehavior quackBehavior) {
        fLyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void print() {
        System.out.println("Hello! With is a read head duck");
    }
}
