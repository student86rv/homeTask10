package ua.epam.homeTask10.behavioralPatterns.memento;

public class AppRunner {

    public static void main(String[] args) {
        PlayerBase base = new PlayerBase();

        System.out.println("Creating new player...");
        Player player = new Player("Vasya");
        System.out.println(player);

        System.out.println("Upgrading player...");
        player.setHealth(player.getHealth() + 20);
        player.setAmmo(player.getAmmo() + 90);
        System.out.println(player);

        System.out.println("Saving player to base...");
        base.setSave(player.save());

        System.out.println("Player took part in battle and died...");
        player.setHealth(0);
        player.setAmmo(0);
        System.out.println(player);

        System.out.println("Loading player from base...");
        player.load(base.getSave());
        System.out.println(player);
    }
}
