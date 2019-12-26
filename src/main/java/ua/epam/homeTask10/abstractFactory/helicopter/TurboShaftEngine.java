package ua.epam.homeTask10.abstractFactory.helicopter;

import ua.epam.homeTask10.abstractFactory.Engine;

public class TurboShaftEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Turbo-shaft engine is started!");
    }
}
