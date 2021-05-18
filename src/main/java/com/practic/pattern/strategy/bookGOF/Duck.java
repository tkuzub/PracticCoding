package com.practic.pattern.strategy.bookGOF;

public abstract class Duck {

    private FLyBehavior fLyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void print();

   public void performFly() {
       fLyBehavior.fly();
   }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFLyBehavior(FLyBehavior fLyBehavior) {
        this.fLyBehavior = fLyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
