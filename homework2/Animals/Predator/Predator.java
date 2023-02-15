package homework2.Animals.Predator;

import homework2.Animals.Animals;

public abstract class Predator extends Animals {

    public Predator(String nickname) {
        super(nickname);
    }

    @Override
    public String feed() {
        return "Мясо";
    }
}
