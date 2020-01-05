package ua.epam.homeTask10.creationalPatterns.abstractFactory.bomber;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.Engine;

public class PropellerTurbine  implements Engine {
    @Override
    public void start() {
        System.out.println("Propeller turbine is started!");
    }
}
