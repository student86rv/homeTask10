package ua.epam.homeTask10.behavioralPatterns.iterator;

public class UserBase implements Collection {

    private class UserIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < users.length;
        }

        @Override
        public Object next() {
            return users[index++];
        }
    }

    private User[] users;

    public UserBase(User[] users) {
        this.users = users;
    }

    @Override
    public Iterator getIterator() {
        return new UserIterator();
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
