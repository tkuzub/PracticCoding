package com.practic.pattern.strategy.bookGOF;

public abstract class Duck {

    private FLyBehavior fLyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    public Duck(FLyBehavior fLyBehavior, QuackBehavior quackBehavior) {
        this.fLyBehavior = fLyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public abstract void print();

    public void execute() {
        fLyBehavior.fly();
        quackBehavior.quack();
    }

    public void setFLyBehavior(FLyBehavior fLyBehavior) {
        this.fLyBehavior = fLyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
