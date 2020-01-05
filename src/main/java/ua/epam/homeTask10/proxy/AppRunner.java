package ua.epam.homeTask10.proxy;

public class AppRunner {

    public static void main(String[] args) {
        User user = new Messenger("user.user@gmail.com");
        user.sendMessage();
    }
}
