package model.impl.QuackBehavior;

import model.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack !");
    }
}
