package ua.epam.homeTask10.proxy;

public class Messenger implements User {

    private Account account;
    private String email;

    public Messenger(String email) {
        this.email = email;
    }

    @Override
    public void sendMessage() {
        if (account == null) {
            account = new Account(email);
        }
        account.sendMessage();
    }
}
