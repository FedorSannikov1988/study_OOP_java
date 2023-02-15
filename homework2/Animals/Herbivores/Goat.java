package homework2.Animals.Herbivores;

import homework2.Interface.Running;

public class Goat extends Herbivores implements Running {

    private static final int runSpeed;

    static {
        runSpeed = 3;
    }

    public Goat(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "Бееее - я Коза !";
    }

    @Override
    public int getSpeedRun() {
        return runSpeed;
    }
}
