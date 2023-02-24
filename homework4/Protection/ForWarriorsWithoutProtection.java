package homework4.Protection;

public class ForWarriorsWithoutProtection implements Armor {

    @Override
    public int protectionArmor() {
        return 0;
    }

    @Override
    public void damage(int damage) {
    }


    @Override
    public String toString() {
        return "Without Protection";
    }
}
