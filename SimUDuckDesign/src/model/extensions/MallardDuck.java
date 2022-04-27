package model.extensions;

import model.Duck;
import model.impl.FlyBehavior.FlyWithWings;
import model.impl.QuackBehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Hello I am Mallard Duck!");
    }
}
