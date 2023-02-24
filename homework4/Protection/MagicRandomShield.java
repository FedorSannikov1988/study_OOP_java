package homework4.Protection;

import java.util.Random;

public class MagicRandomShield implements Armor {

    int protectionFromDrunkenMagician = new Random().nextInt(1,100);

    @Override
    public int protectionArmor() {
        return protectionFromDrunkenMagician;
    }

    @Override
    public void damage(int damage) {
        this.protectionFromDrunkenMagician = protectionFromDrunkenMagician - damage;
    }

    @Override
    public String toString() {
        return "MagicRandomShield{ protection= " + protectionArmor() + " }";
    }

}
