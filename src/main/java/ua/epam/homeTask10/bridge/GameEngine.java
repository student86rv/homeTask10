package ua.epam.homeTask10.bridge;

public class GameEngine extends GameModule {

    public GameEngine(Developer developer) {
        super(developer);
    }

    @Override
    public void developModule() {
        System.out.println("Engine building in progress...");
        developer.develop();
    }
}
