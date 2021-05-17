package com.practic.pattern.strategy.bookGOF;

public class FlyLikeRocket implements FLyBehavior {
    @Override
    public void fly() {
        System.out.println("FLy like a rocket");
    }
}
