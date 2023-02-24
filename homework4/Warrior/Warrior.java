package homework4.Warrior;

import homework4.Protection.ForWarriorsWithoutProtection;
import homework4.Protection.Armor;

import homework4.Weapon.Weapon;

import java.util.Random;

public abstract class Warrior <T1 extends Weapon, T2 extends Armor> {

    private String name;
    protected T1 weapon;
    protected T2 armor;
    private int healthPoint;
    protected Random rnd = new Random();

    public Warrior(String name, T1 weapon, T2 armor) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        healthPoint = 100;
    }

    public Warrior(String name, T1 weapon) {
        this.name = name;
        this.weapon = weapon;
        this.armor = (T2) new ForWarriorsWithoutProtection();
        healthPoint = 100;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage());

        if (enemy.getProtection() <= 0) {
            enemy.reduceHealthPoint(damage);
        }
        else {
            int byffer = enemy.getProtection() - damage;
            if(byffer >= 0) {enemy.setDamage(byffer);}
            else {enemy.setDamage(0);}
        }
        return damage;
    }



    public int getMaxDamage() {
        return weapon.damage();
    }

    public int getProtection() {
        return armor.protectionArmor();
    }

    public void setDamage(int damage){
        armor.damage(damage);
    }
    @Override
    public String toString() {
        return "Warrior{" + " name= " + name +
                ", healthPoint= " + healthPoint +
                ", weapon= " + weapon +
                ", armor= " + armor + " }";
    }

}
