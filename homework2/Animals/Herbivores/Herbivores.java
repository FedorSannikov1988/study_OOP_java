package homework2.Animals.Herbivores;

import homework2.Animals.Animals;

public abstract class Herbivores extends Animals {

    public Herbivores(String nickname) {
        super(nickname);
    }

    @Override
    public String feed() {
        return "Трава";
    }
}
