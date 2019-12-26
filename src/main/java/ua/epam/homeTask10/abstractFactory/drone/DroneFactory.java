package ua.epam.homeTask10.abstractFactory.drone;

import ua.epam.homeTask10.abstractFactory.AircraftFactory;
import ua.epam.homeTask10.abstractFactory.Engine;
import ua.epam.homeTask10.abstractFactory.Weapon;

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
