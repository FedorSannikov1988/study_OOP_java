package homework2.Animals.Predator;

import homework2.Interface.Running;

public class Leo extends Predator implements Running {

    private static final int runSpeed;

    static {
        runSpeed = 6;
    }

    public Leo(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "Ррррр - я Лев !";
    }

    @Override
    public int getSpeedRun() {
        return runSpeed;
    }
}
