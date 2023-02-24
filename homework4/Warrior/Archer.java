package homework4.Warrior;

import homework4.Protection.Armor;
import homework4.Weapon.Bow;

public class Archer extends Warrior<Bow, Armor> implements DistanceAttackerArcher {
    private int distance  = weapon.getDistance() + rnd.nextInt(10);

    public Archer(String name, Bow weapon, Armor armor) {
        super(name, weapon, armor);
    }

    public Archer(String name, Bow weapon) {
        super(name, weapon);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{ " +
                "final distance attack= " + distance + " }";
    }
}
