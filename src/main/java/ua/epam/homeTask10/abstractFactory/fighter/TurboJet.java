package ua.epam.homeTask10.abstractFactory.fighter;

import ua.epam.homeTask10.abstractFactory.Engine;

public class TurboJet implements Engine {
    @Override
    public void start() {
        System.out.println("TurboJet is started!");
    }
}
