package com.hjx.android.designpattern.strategy;

/**
 * Created by hjx on 0015 8-15.
 * You can make it better
 */

public abstract class Duck {
    private FlyBehavior mFlyBehavior;
    private QuackBehavior mQuackBehavior;

    private void Swing(){
        System.out.println("鸭子游泳");
    }

    public void actionFly(){
        if(mFlyBehavior!=null){
            mFlyBehavior.fly();
        }
    }

    public void actionQuack(){
        if(mQuackBehavior!=null){
            mQuackBehavior.quack();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }

    public abstract void display();
}
