package homework4.Protection;

public class BigShield implements Armor {

    private int protectionBigShield = 85;

    @Override
    public int protectionArmor() {
        return protectionBigShield;
    }

    @Override
    public void damage(int damage) {
        this.protectionBigShield = protectionBigShield - damage;
    }

    @Override
    public String toString() {
        return "BigShield{ protection= " + protectionArmor() + " }";
    }
}
