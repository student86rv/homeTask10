package ua.epam.homeTask10.creationalPatterns.builder;

public class AppRunner {

    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        accountManager.setBuilder(new HumanBuilder());

        Person person = accountManager.buildPerson();
        System.out.println(person);
    }
}
