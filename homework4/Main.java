package homework4;

import homework4.Protection.BigShield;
import homework4.Protection.MagicRandomShield;
import homework4.Protection.SmallShield;

import homework4.Warrior.Warrior;
import homework4.Warrior.SwordMan;
import homework4.Warrior.Archer;

import homework4.Weapon.Sword;
import homework4.Weapon.Bow;

public class Main {
    public static void main(String[] args) {

        Warrior character0 = new SwordMan("мечник0", new Sword(), new BigShield());
        System.out.println("\n" + character0 + "\n");
        System.out.println("\n" + character0.getProtection() + "\n");

        Warrior character1 = new SwordMan("мечник1", new Sword(), new BigShield());
        System.out.println("\n" + character1 + "\n");

        Warrior character2 = new SwordMan("мечник2", new Sword());
        System.out.println("\n" + character2 + "\n");

        Warrior character3 = new Archer("лучник1", new Bow(), new MagicRandomShield());
        System.out.println("\n" + character3 + "\n");

        Warrior character4 = new Archer("лучник2", new Bow());
        System.out.println("\n" + character4 + "\n");

        Team<Archer> archerTeam = new Team<>("Только лучники");
        archerTeam.addWarrior(new Archer("Лучник1", new Bow(), new BigShield()))
                .addWarrior(new Archer("Лучник2", new Bow(), new SmallShield()))
                .addWarrior(new Archer("Лучник3", new Bow(), new BigShield()));

        System.out.println(archerTeam);

        Team<SwordMan> swordmanTeam = new Team<>("Только мечники");
        swordmanTeam.addWarrior(new SwordMan("Мечник1", new Sword(), new BigShield()))
                .addWarrior(new SwordMan("Мечник2", new Sword(), new SmallShield()))
                .addWarrior(new SwordMan("Мечник3", new Sword(), new BigShield()));

        System.out.println(swordmanTeam);

        Team<Warrior> mixTeam = new Team<>("Смешенная комманда");
        mixTeam.addWarrior(new Archer("Лучник1", new Bow(), new BigShield()))
                .addWarrior(new Archer("Лучник2", new Bow(), new MagicRandomShield()))
                .addWarrior(new SwordMan("Мечник1", new Sword(), new BigShield()))
                .addWarrior(new SwordMan("Мечник1", new Sword()))
                .addWarrior(new SwordMan("Мечник2", new Sword(), new MagicRandomShield()));

        System.out.println(mixTeam);

        while (character0.getHealthPoint() > 0 && character1.getHealthPoint() > 0) {
            int damage2 = character0.hitDamage(character1);
            int damage1 = character1.hitDamage(character0);
            System.out.printf("#1->Здоровье %d, Защита %d; " +
                            "#2->Здоровье %d, Защита %d \n",
                    character0.getHealthPoint(), character0.getProtection(),
                    character1.getHealthPoint(), character1.getProtection());
        }

        if (character1.getHealthPoint()>0)
            System.out.println("Победил #1");
        else
            System.out.println("Победил #2");
    }
}