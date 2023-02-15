package homework2.Animals.Predator;

import homework2.Interface.Floating;
import homework2.Interface.Running;

public class Otter extends Predator implements Running, Floating {

    private static final int runSpeed;
    private static final int floatSpeed;

    static {
        runSpeed = 4;
        floatSpeed = 6;
    }

    public Otter(String nickname) {
        super(nickname);
    }

    @Override
    public int getSpeedFloat() {
        return floatSpeed;
    }

    @Override
    public int getSpeedRun() {
        return runSpeed;
    }

    @Override
    public String say() {
        return "Фырк фырк - я Выдра !";
    }
}
