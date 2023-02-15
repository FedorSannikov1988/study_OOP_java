package homework2.Animals.Herbivores;

import homework2.Interface.Floating;
import homework2.Interface.Running;

public class Beaver extends Herbivores implements Running, Floating {

    private static final int runSpeed;
    private static final int floatSpeed;

    static {
        runSpeed = 3;
        floatSpeed = 4;
    }

    public Beaver(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "Хрусть хрусть - я Бобер !";
    }

    @Override
    public int getSpeedFloat() {
        return floatSpeed;
    }

    @Override
    public int getSpeedRun() {
        return runSpeed;
    }
}
