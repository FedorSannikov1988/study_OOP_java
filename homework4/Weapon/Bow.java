package homework4.Weapon;

public class Bow implements Weapon {

    private int distanceBow = 30;

    public int getDistance() {
        return distanceBow;
    }

    @Override
    public int damage() {
        return 50;
    }

    @Override
    public String toString() {
        return "Bow{ " + "distance= " + distanceBow + ", damage= " + damage() + " }";
    }
}
