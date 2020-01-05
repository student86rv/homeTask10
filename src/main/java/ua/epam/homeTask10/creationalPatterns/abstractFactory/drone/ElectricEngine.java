package ua.epam.homeTask10.creationalPatterns.abstractFactory.drone;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.Engine;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine is started!");
    }
}
