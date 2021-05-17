package com.practic.pattern.strategy.bookGOF;

public class DecoyDuck extends Duck {

    @Override
    public void print() {
        System.out.println("Hello! this is a decoy");
    }
}
