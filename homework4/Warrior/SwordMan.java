package homework4.Warrior;

import homework4.Protection.Armor;
import homework4.Weapon.Sword;

public class SwordMan extends Warrior<Sword, Armor> {

    public SwordMan(String name, Sword weapon, Armor armor) {
        super(name, weapon, armor);
    }

    public SwordMan(String name, Sword weapon) {
        super(name, weapon);
    }

    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }
}
