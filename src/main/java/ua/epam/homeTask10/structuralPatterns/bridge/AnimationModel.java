package ua.epam.homeTask10.structuralPatterns.bridge;

public class AnimationModel extends GameModule {

    public AnimationModel(Developer developer) {
        super(developer);
    }

    @Override
    public void developModule() {
        System.out.println("Animation model building in progress...");
        developer.develop();
    }
}
