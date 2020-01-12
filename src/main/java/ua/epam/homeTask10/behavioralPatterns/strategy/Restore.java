package ua.epam.homeTask10.behavioralPatterns.strategy;

public class Restore implements Activity {

    @Override
    public void makeMove() {
        System.out.println("Player is healing, gathering resources...");
    }
}
