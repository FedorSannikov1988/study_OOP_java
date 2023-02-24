package homework4.Weapon;

public class Sword implements Weapon {

    @Override
    public int damage() {
        return 80;
    }

    @Override
    public String toString() {
        return "Sword{ damage= " + damage() +" }";
    }
}
