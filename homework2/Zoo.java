package homework2;

import homework2.Animals.Animals;
import homework2.Interface.Sounds;
import homework2.Interface.Running;
import homework2.Interface.Flying;
import homework2.Interface.Floating;

import java.util.List;
import java.util.ArrayList;

public class Zoo {

    List<Animals> animalList = new ArrayList<Animals>();
    Sounds radio;

    public Zoo() {
        this(new ArrayList<Animals>());
    }

    public Zoo(List<Animals> animals) {
        this.animalList.addAll(animals);
    }

    public Zoo(List<Animals> animals, Radio ForRadio) {
        this.animalList.addAll(animals);
        this.radio = ForRadio;
    }

    public void addAnimal(Animals animal) {
        animalList.add(animal);
    }

    public void addAnimal(List<Animals> animals) {
        this.animalList.addAll(animals);
    }

    public List<Animals> getAnimalList() {
        return this.animalList;
    }

    public List<Sounds> getSoundList() {

        List<Sounds> soundsList = new ArrayList<>();

        for (Animals animal : this.animalList) {
            soundsList.add(animal);
        }
        soundsList.add(this.radio);
        return soundsList;
    }

    public List<Running> getRunningListTypeRunning() {

        List<Running> runningList = new ArrayList<>();

        for (Animals animal : this.animalList) {
            if(animal instanceof Running) {
                runningList.add((Running) animal);
            }
        }
        return runningList;
    }

    public List<Animals> getRunningListTypeAnimals() {

        List<Animals> runningList = new ArrayList<>();

        for (Animals animal : this.animalList) {
            if(animal instanceof Running) {
                runningList.add(animal);
            }
        }
        return runningList;
    }

    public List<Animals> getFlyingListTypeAnimals() {

        List<Animals> flyingList = new ArrayList<>();

        for (Animals animal : this.animalList) {
            if(animal instanceof Flying) {
                flyingList.add(animal);
            }
        }
        return flyingList;
    }

    public List<Flying> getFlyingListTypeFlying() {

        List<Flying> flyingList = new ArrayList<>();

        for (Animals animal : this.animalList) {
            if(animal instanceof Flying) {
                flyingList.add((Flying)animal);
            }
        }
        return flyingList;
    }

    public List<Floating> getFloatingListTypeFloating() {

        List<Floating> floatingList = new ArrayList<>();

        for (Animals animal : this.animalList) {
            if(animal instanceof Floating) {
                floatingList.add((Floating) animal);
            }
        }
        return floatingList;
    }

    public List<Animals> getFloatingListTypeAnimals() {

        List<Animals> floatingList = new ArrayList<>();

        for (Animals animal : this.animalList) {
            if(animal instanceof Floating) {
                floatingList.add(animal);
            }
        }
        return floatingList;
    }

    public Animals getRunChampion() {
        List<Running> runners = getRunningListTypeRunning();
        Running champion = runners.get(0);
        for (Running oneRunner : runners){
            if(champion.getSpeedRun() < oneRunner.getSpeedRun()){
                champion = oneRunner;
            }
        }
        return (Animals) champion;
    }

    public Animals getFlyingChampion() {
        List<Flying> flyers = getFlyingListTypeFlying();
        Flying champion = flyers.get(0);
        for (Flying oneFlyer : flyers){
            if(champion.getSpeedFlyable() < oneFlyer.getSpeedFlyable()){
                champion = oneFlyer;
            }
        }
        return (Animals) champion;
    }

    public Animals getFloatingChampion() {
        List<Floating> floats = getFloatingListTypeFloating();
        Floating champion = floats.get(0);
        for (Floating oneFloat : floats){
            if(champion.getSpeedFloat() < oneFloat.getSpeedFloat()){
                champion = oneFloat;
            }
        }
        return (Animals) champion;
    }

}
