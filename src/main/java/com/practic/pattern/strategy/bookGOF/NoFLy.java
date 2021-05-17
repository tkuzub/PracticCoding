package com.practic.pattern.strategy.bookGOF;

public class NoFLy implements FLyBehavior {
    @Override
    public void fly() {
        System.out.println("No fly");
    }
}
