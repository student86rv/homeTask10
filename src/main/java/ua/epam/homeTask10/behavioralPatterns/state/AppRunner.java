package ua.epam.homeTask10.behavioralPatterns.state;

public class AppRunner {

    public static void main(String[] args) {
        Activity activity = new Move();
        Player player = new Player();
        player.setActivity(activity);

        for (int i = 1; i <= 10; i++) {
            player.makeMove();
            player.changeActivity();
        }
    }
}
