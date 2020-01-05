package ua.epam.homeTask10.structuralPatterns.facade;

public class AppRunner {

    public static void main(String[] args) {
        Traffic traffic = new Traffic();
        traffic.startTraffic();
    }
}
