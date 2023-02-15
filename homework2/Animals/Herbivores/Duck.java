package homework2.Animals.Herbivores;

import homework2.Interface.Floating;
import homework2.Interface.Flying;
import homework2.Interface.Running;

public class Duck extends Herbivores implements Running, Flying, Floating {

    private static final int flightSpeed;
    private static final int runSpeed;
    private static final int floatSpeed;

    static {
        flightSpeed = 4;
        runSpeed = 1;
        floatSpeed = 2;
    }

    public Duck(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "Кря кря кря - я Утка !";
    }

    @Override
    public int getSpeedFlyable() {
        return flightSpeed ;
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
