package ua.epam.homeTask10.behavioralPatterns.state;

public class Attack implements Activity {

    @Override
    public void makeMove() {
        System.out.println("Player attacks enemy...");
    }
}
