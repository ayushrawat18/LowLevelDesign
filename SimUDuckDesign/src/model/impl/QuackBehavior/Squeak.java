package model.impl.QuackBehavior;

import model.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak !");
    }
}
