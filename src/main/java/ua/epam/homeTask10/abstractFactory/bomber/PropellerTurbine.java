package ua.epam.homeTask10.abstractFactory.bomber;

import ua.epam.homeTask10.abstractFactory.Engine;

public class PropellerTurbine  implements Engine {
    @Override
    public void start() {
        System.out.println("Propeller turbine is started!");
    }
}
