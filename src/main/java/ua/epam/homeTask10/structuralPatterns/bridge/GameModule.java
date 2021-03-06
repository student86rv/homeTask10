package ua.epam.homeTask10.structuralPatterns.bridge;

public abstract class GameModule {

    protected Developer developer;

    public GameModule(Developer developer) {
        this.developer = developer;
    }

    public abstract void developModule();
}
