package ua.epam.homeTask10.behavioralPatterns.strategy;

public class AppRunner {

    public static void main(String[] args) {
        Player player = new Player();

        player.setActivity(new Move());
        player.executeActivity();

        player.setActivity(new Attack());
        player.executeActivity();

        player.setActivity(new Defend());
        player.executeActivity();

        player.setActivity(new Restore());
        player.executeActivity();
    }
}
