package ua.epam.homeTask10.behavioralPatterns.observer;

public class AppRunner {

    public static void main(String[] args) {
        GameMapsEditor gm = new GameMapsEditor();
        gm.addMap("Surrounded City");
        gm.addMap("Bloody Fields");

        Observer player1 = new Player("Vasya");
        Observer player2 = new Player("Petya");
        gm.addObserver(player1);
        gm.addObserver(player2);

        gm.addMap("Dark Forest");
        gm.removeMap("Surrounded City");
    }
}
