package homework4.Protection;

public class SmallShield implements Armor {

    private int protectionSmallShield = 40;

    @Override
    public int protectionArmor() {
        return protectionSmallShield;
    }

    @Override
    public void damage(int damage) {
        this.protectionSmallShield = protectionSmallShield - damage;
    }

    @Override
    public String toString() {
        return "SmallShield{ protection= " + protectionArmor() + " }";
    }
}
