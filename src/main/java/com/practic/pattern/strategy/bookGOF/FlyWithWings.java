package com.practic.pattern.strategy.bookGOF;

public class FlyWithWings implements FLyBehavior {
    @Override
    public void fly() {
        System.out.println("FLy with wings");
    }
}
