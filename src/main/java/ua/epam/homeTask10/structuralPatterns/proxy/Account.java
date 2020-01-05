package ua.epam.homeTask10.structuralPatterns.proxy;

public class Account implements User{

    private String email;

    public Account(String email) {
        this.email = email;
        createAccount();
    }

    public void createAccount() {
        System.out.println("Creating new account...");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message from User...");
    }
}
