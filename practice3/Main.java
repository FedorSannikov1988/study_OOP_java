package practice3;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        User userOne = new User("Один", "Один", 10);
        User userTwo = new User("Два", "Два", 11);
        User userThree = new User("Три", "Три", 12);

        User[] users =  new User[]{userOne, userTwo, userThree};

        Personal personalOne = new Personal(users);

        System.out.println("\n");

        for (User user : personalOne) {
            System.out.println(user);
        }

/*
        while (personalOne.hasNext()) {
            System.out.println(personalOne.next());
        }
*/
    }
}