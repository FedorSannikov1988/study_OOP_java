package practice3;

import java.util.Iterator;

public class Personal implements Iterable<User> {

    private User[] users;

    public Personal(User[] users) {
        this.users = users;
    }
/*
    private int index = 0;

    @Override
    public boolean hasNext() {
        return index < users.length;
    }

    @Override
    public User next() {
        return users[index++];
    }
*/

    @Override
    public Iterator<User> iterator() {
        return new PersonalIterator();
    }

    protected class PersonalIterator implements Iterator<User> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < users.length;
         }

        @Override
        public User next() {
            return users[index++];
        }
    }
}



