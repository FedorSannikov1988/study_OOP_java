package homework2;

import homework2.Animals.Animals;
import homework2.Interface.Flying;
import homework2.Interface.Floating;
import homework2.Interface.Running;
import homework2.Interface.Sounds;

import homework2.Animals.Herbivores.Cow;
import homework2.Animals.Herbivores.Duck;
import homework2.Animals.Herbivores.Goat;
import homework2.Animals.Herbivores.Beaver;

import homework2.Animals.Predator.Crocodile;
import homework2.Animals.Predator.Eagle;
import homework2.Animals.Predator.Leo;
import homework2.Animals.Predator.Otter;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Radio radio = new Radio();

        List<Animals> animalsList = new ArrayList<Animals>();

        System.out.println("\n" + "Звуки издаваемые в зоопарке:");
        Animals cow = new Cow("Корова Мурка");
        Animals crocodile = new Crocodile("Крокодил Гена");
        Animals leo = new Leo("Лев Симба");
        Animals goat = new Goat("Коза Маруся");
        Animals duck = new Duck("Утка Дональд");
        Animals beaver = new Beaver("Бобер Бобрик");
        Animals otter = new Otter("Выдра Выдрик");
        Animals eagle = new Eagle("Орел Орлик");

        animalsList.add(cow);
        animalsList.add(crocodile);
        animalsList.add(leo);
        animalsList.add(goat);
        animalsList.add(duck);

        Zoo zooOne = new Zoo(animalsList, radio);

        //добавленные животные
        zooOne.addAnimal(beaver);
        zooOne.addAnimal(otter);
        zooOne.addAnimal(eagle);

        for (Sounds animal: zooOne.getSoundList()) {
            System.out.println(animal.say());
        }

        Zoo zooTwo = new Zoo(animalsList);

        //добавленные животные
        zooTwo.addAnimal(beaver);
        zooTwo.addAnimal(otter);
        zooTwo.addAnimal(eagle);

        System.out.println("\n" + "Животные которые умеют бегать");
        System.out.println("\n" + "тип/класс Running:");
        System.out.println("- - - - - - ");
        for (Running animal: zooTwo.getRunningListTypeRunning()) {
            System.out.println(((Animals)animal).getNickname());
            System.out.println(((Animals)animal).say());
            System.out.println(((Animals)animal).feed());
            System.out.println("Скорость бега: " + animal.getSpeedRun());
            System.out.println("- - - - - - ");
        }

        System.out.println("\n" + "тип/класс Animals:");
        System.out.println("- - - - - - ");
        for (Animals animal: zooTwo.getRunningListTypeAnimals()) {
            System.out.println(animal.getNickname());
            System.out.println(animal.say());
            System.out.println(animal.feed());
            System.out.println("Скорость бега: " + ((Running)animal).getSpeedRun());
            System.out.println("- - - - - - ");
        }

        System.out.println("\n" + "Животные которые умеют летать");
        System.out.println("\n" + "тип/класс Flying:");
        System.out.println("- - - - - - ");
        for (Flying animal: zooTwo.getFlyingListTypeFlying()) {
            System.out.println(((Animals)animal).getNickname());
            System.out.println(((Animals)animal).say());
            System.out.println(((Animals)animal).feed());
            System.out.println("Скорость полета: " + animal.getSpeedFlyable());
            System.out.println("- - - - - - ");
        }

        System.out.println("\n" + "тип/класс Animals:");
        System.out.println("- - - - - - ");
        for (Animals animal: zooTwo.getFlyingListTypeAnimals()) {
            System.out.println(animal.getNickname());
            System.out.println(animal.say());
            System.out.println(animal.feed());
            System.out.println("Скорость полета: " + ((Flying)animal).getSpeedFlyable());
            System.out.println("- - - - - - ");
        }

        System.out.println("\n" + "Животные которые умеют плавать");
        System.out.println("\n" + "тип/класс Floating:");
        System.out.println("- - - - - - ");
        for (Floating animal: zooTwo.getFloatingListTypeFloating()) {
            System.out.println(((Animals)animal).getNickname());
            System.out.println(((Animals)animal).say());
            System.out.println(((Animals)animal).feed());
            System.out.println("Скорость плавания: " + animal.getSpeedFloat());
            System.out.println("- - - - - - ");
        }

        System.out.println("\n" + "тип/класс Animals:");
        System.out.println("- - - - - - ");
        for (Animals animal: zooTwo.getFloatingListTypeAnimals()) {
            System.out.println(animal.getNickname());
            System.out.println(animal.say());
            System.out.println(animal.feed());
            System.out.println("Скорость плавания: " + ((Floating)animal).getSpeedFloat());
            System.out.println("- - - - - - ");
        }

        System.out.println("\n" + "Животное чемпион по скорости бега:");
        System.out.println("\n" + "тип/класс Animals:");
        System.out.println(zooTwo.getRunChampion());

        System.out.println("\n" + "Животное чемпион по скорости полета:");
        System.out.println("\n" + "тип/класс Animals:");
        System.out.println(zooTwo.getFlyingChampion());

        System.out.println("\n" + "Животное чемпион по скорости плавания:");
        System.out.println("\n" + "тип/класс Animals:");
        System.out.println(zooTwo.getFloatingChampion());

    }
}
