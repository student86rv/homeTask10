package ua.epam.homeTask10.creationalPatterns.abstractFactory.helicopter;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.Engine;

public class TurboShaftEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Turbo-shaft engine is started!");
    }
}
