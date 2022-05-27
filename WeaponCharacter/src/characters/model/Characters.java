package characters.model;

import Weapons.model.WeaponBehavior;

public abstract class Characters {
      public WeaponBehavior wb;
     public abstract void fight();

     public void setWeaponBehaviour(WeaponBehavior wb) {
          this.wb = wb;
     }
}
