package model.impl.FlyBehavior;

import model.interfaces.FlyBehavior;

public class FlyWithRocketSpeed implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with rocket speed! I am hot!");
    }
}
