package practice3;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        User userOne = new User("Три", "Три", 12);
        User userTwo = new User("Два", "Два", 11);
        User userThree = new User("Один", "Один", 10);

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

    List<User> UserForList = personalOne.toList();

        System.out.println(UserForList.get(0).compareTo(UserForList.get(0)));
        System.out.println(UserForList.get(1).compareTo(UserForList.get(0)));

        Collections.sort(UserForList);
        System.out.println(UserForList);

    }
}