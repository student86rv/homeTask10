package ua.epam.homeTask10.creationalPatterns.abstractFactory.drone;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.AircraftFactory;
import ua.epam.homeTask10.creationalPatterns.abstractFactory.Engine;
import ua.epam.homeTask10.creationalPatterns.abstractFactory.Weapon;

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
