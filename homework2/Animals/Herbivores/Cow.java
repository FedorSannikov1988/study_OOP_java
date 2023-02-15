package homework2.Animals.Herbivores;

import homework2.Interface.Running;

public class Cow extends Herbivores implements Running {

    private static final int runSpeed;

    static {
        runSpeed = 1;
    }

    public Cow(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "Муууу - я Корова !";
    }

    @Override
    public int getSpeedRun() {
        return runSpeed;
    }
}
