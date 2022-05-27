import Weapons.service.BowArrowBehavior;
import Weapons.service.KnifeBehavior;
import characters.King;
import characters.model.Characters;

public class Main {
    public static void main(String args[]) {
        Characters king = new King();
        king.setWeaponBehaviour(new KnifeBehavior());
        king.fight();

        king.setWeaponBehaviour(new BowArrowBehavior());
        king.fight();

    }
}
