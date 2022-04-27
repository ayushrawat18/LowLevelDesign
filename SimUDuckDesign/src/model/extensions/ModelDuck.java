package model.extensions;

import model.Duck;
import model.impl.FlyBehavior.FlyNoWay;
import model.impl.QuackBehavior.Squeak;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am model duck!");
    }
}
