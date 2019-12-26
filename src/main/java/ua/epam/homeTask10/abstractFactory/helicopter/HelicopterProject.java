package ua.epam.homeTask10.abstractFactory.helicopter;

import ua.epam.homeTask10.abstractFactory.ArmedAircraftFactory;
import ua.epam.homeTask10.abstractFactory.Engine;
import ua.epam.homeTask10.abstractFactory.Weapon;

public class HelicopterProject {

    public static void main(String[] args) {
        ArmedAircraftFactory fighterFactory = new HelicopterFactory();
        Engine engine = fighterFactory.getEngine();
        Weapon firstWeapon = fighterFactory.getWeapon();
        Weapon secondWeapon = fighterFactory.getAdditionalWeapon();

        System.out.println("Testing Helicopter prototype:");
        engine.start();
        firstWeapon.fire();
        secondWeapon.fire();
    }
}
