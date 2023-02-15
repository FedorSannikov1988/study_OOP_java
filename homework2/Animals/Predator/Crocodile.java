package homework2.Animals.Predator;

import homework2.Interface.Running;
import homework2.Interface.Floating;

public class Crocodile extends Predator implements Running, Floating {

    private static final int runSpeed;

    private static final int floatSpeed;

    static {
        runSpeed = 10;
        floatSpeed = 7;
    }

    public Crocodile(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "Шшшшш - я Крокодил !";
    }

    @Override
    public int getSpeedRun() {
        return runSpeed;
    }

    @Override
    public int getSpeedFloat() {
        return floatSpeed;
    }
}
