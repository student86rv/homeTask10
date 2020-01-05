package ua.epam.homeTask10.structuralPatterns.bridge;

public class GraphicAnimator implements Developer {
    @Override
    public void develop() {
        System.out.println("GraphicAnimator draws 3D model...");
    }
}
