package ua.epam.homeTask10.structuralPatterns.composite;

public class AppRunner {

    public static void main(String[] args) {
        Team team = new Team();
        team.addDeveloper(new SoftwareDeveloper());
        team.addDeveloper(new GraphicAnimator());
        team.createGame();
    }
}
