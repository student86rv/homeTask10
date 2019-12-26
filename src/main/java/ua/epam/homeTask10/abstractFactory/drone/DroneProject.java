package ua.epam.homeTask10.abstractFactory.drone;

import ua.epam.homeTask10.abstractFactory.AircraftFactory;
import ua.epam.homeTask10.abstractFactory.Engine;
import ua.epam.homeTask10.abstractFactory.Weapon;

public class DroneProject {

    public static void main(String[] args) {
        AircraftFactory droneFactory = new DroneFactory();
        Engine engine = droneFactory.getEngine();
        Weapon weapon = droneFactory.getWeapon();

        System.out.println("Testing Drone prototype:");
        engine.start();
        weapon.fire();
    }
}
