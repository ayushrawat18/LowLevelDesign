package Weapons.service;

import Weapons.model.WeaponBehavior;

 public class BowArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Using Bow Arrow");
    }
}
