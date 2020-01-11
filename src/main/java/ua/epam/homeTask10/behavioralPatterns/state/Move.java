package ua.epam.homeTask10.behavioralPatterns.state;

public class Move implements Activity {

    @Override
    public void makeMove() {
        System.out.println("Player is moving...");
    }
}
