package homework2.Animals;

import homework2.Interface.Floating;
import homework2.Interface.Flying;
import homework2.Interface.Running;
import homework2.Interface.Sounds;

public abstract class Animals implements Sounds {

    private String nickname;

    protected Animals(String nickname) {
        this.nickname = nickname;
    }

    //public abstract String say();

    public abstract String feed();

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {

        StringBuilder srtOutDataOnePart = new StringBuilder(
                        "кличка: " + this.nickname + " "
                        + "корм: " + this.feed() + " "
                        + "голос: " + say() + " ");

        StringBuilder srtOutDataTwoPart = new StringBuilder();

        if (this instanceof Running) {
            srtOutDataTwoPart.append(" cкорость бега: " + ((Running) this).getSpeedRun());
        }
        if (this instanceof Floating) {
            srtOutDataTwoPart.append(" cкорость плавания: " + ((Floating) this).getSpeedFloat());
        }
        if (this instanceof Flying) {
            srtOutDataTwoPart.append(" cкорость полёта: " + ((Flying) this).getSpeedFlyable());
        }

        srtOutDataOnePart.append(srtOutDataTwoPart);

        return srtOutDataOnePart.toString();
    }
}