package model;

import model.interfaces.FlyBehavior;
import model.interfaces.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;


    public void swim() {
        System.out.println("I can swim !");
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public  void performFly(){
        flyBehavior.fly();
    }

}
