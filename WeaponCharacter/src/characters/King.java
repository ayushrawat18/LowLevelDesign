package characters;

import Weapons.service.KnifeBehavior;
import characters.model.Characters;

public class King extends Characters {


    @Override
    public void fight() {
        System.out.println("King is fighting");
        this.wb.useWeapon();
    }
}
