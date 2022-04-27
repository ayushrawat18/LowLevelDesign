package model.impl.FlyBehavior;

import model.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly I have no wings !");
    }
}
