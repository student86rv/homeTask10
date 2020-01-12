package ua.epam.homeTask10.behavioralPatterns.strategy;

public class Move implements Activity {

    @Override
    public void makeMove() {
        System.out.println("Player is moving...");
    }
}
