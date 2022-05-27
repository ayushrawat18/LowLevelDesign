package characters;

import Weapons.service.BowArrowBehavior;
import characters.model.Characters;

public class Queen extends Characters {


    public Queen() {
        this.wb = new BowArrowBehavior();
    }

    @Override
    public void fight() {

    }
}
