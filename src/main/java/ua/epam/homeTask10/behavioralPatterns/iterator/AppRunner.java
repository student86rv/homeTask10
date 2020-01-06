package ua.epam.homeTask10.behavioralPatterns.iterator;

public class AppRunner {

    public static void main(String[] args) {
        User[] usersArr = {
                new User(1, "Ivan Ivanov"),
                new User(2, "Petr Petrov"),
                new User(3, "Sidor Sidorov")
        };
        UserBase userBase = new UserBase(usersArr);

        Iterator iterator = userBase.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
