package ua.epam.homeTask10.abstractFactory.drone;

import ua.epam.homeTask10.abstractFactory.Engine;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine is started!");
    }
}
