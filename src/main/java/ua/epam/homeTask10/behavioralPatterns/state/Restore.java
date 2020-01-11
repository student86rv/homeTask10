package ua.epam.homeTask10.behavioralPatterns.state;

public class Restore implements Activity {

    @Override
    public void makeMove() {
        System.out.println("Player is healing, gathering resources...");
    }
}
