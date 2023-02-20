package practice3;

public class User implements Comparable<User> {

    private int age;
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName, int age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                " \n";
    }

    @Override
    public int compareTo(User o) {

        int conditionFirstName = firstName.compareTo(o.firstName);

        if(conditionFirstName != 0) {
            return conditionFirstName;
        }

        int conditionLastName = lastName.compareTo(o.lastName);

        if (conditionLastName != 0) {
            return conditionLastName;
        }

        return this.age - o.age ;
    }

}

