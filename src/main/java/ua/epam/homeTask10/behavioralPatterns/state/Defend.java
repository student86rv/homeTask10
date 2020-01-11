package ua.epam.homeTask10.behavioralPatterns.state;

public class Defend implements Activity {

    @Override
    public void makeMove() {
        System.out.println("Player is defending his position...");
    }
}
