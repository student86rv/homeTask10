package ua.epam.homeTask10.structuralPatterns.bridge;

public class AppRunner {

    public static void main(String[] args) {
        GameModule[] modules = {
                new GameEngine(new SoftwareDeveloper()),
                new AnimationModel(new GraphicAnimator())
        };

        for (GameModule gameModule : modules) {
            gameModule.developModule();
        }
    }
}
