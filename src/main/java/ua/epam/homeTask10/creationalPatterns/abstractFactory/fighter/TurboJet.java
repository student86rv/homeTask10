package ua.epam.homeTask10.creationalPatterns.abstractFactory.fighter;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.Engine;

public class TurboJet implements Engine {
    @Override
    public void start() {
        System.out.println("TurboJet is started!");
    }
}
