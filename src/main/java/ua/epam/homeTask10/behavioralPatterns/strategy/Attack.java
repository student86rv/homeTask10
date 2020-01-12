package ua.epam.homeTask10.behavioralPatterns.strategy;

public class Attack implements Activity {

    @Override
    public void makeMove() {
        System.out.println("Player attacks enemy...");
    }
}
