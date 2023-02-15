package homework2;

import homework2.Interface.Sounds;

public class Radio implements Sounds {

    @Override
    public String say() {
        return "бла - бла - бла - я Радио !";
    }

}
