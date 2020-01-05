package ua.epam.homeTask10.creationalPatterns.abstractFactory.drone;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.AircraftFactory;
import ua.epam.homeTask10.creationalPatterns.abstractFactory.Engine;
import ua.epam.homeTask10.creationalPatterns.abstractFactory.Weapon;

public class DroneFactory implements AircraftFactory {
    @Override
    public Engine getEngine() {
        return new ElectricEngine();
    }

    @Override
    public Weapon getWeapon() {
        return new Camera();
    }
}
