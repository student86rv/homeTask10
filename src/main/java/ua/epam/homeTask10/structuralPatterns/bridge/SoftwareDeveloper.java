package ua.epam.homeTask10.structuralPatterns.bridge;

public class SoftwareDeveloper implements Developer {
    @Override
    public void develop() {
        System.out.println("SoftwareDeveloper writes code...");
    }
}
