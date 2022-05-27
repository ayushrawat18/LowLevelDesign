package Weapons.service;

import Weapons.model.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Using knife");
    }

    public void sharpKnife(){
        System.out.println("Knife sharped");
    }
}
