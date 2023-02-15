package homework2.Animals.Predator;

import homework2.Interface.Flying;
import homework2.Interface.Running;

public class Eagle extends Predator implements Running, Flying {

    private static final int flightSpeed;
    private static final int runSpeed;

    static {
        flightSpeed = 10;
        runSpeed = 1;
    }

    public Eagle(String nickname) {
        super(nickname);
    }

    @Override
    public int getSpeedFlyable() {
        return flightSpeed;
    }

    @Override
    public int getSpeedRun() {
        return runSpeed;
    }

    @Override
    public String say() {
        return "Кар кар - я Орел !";
    }
}
