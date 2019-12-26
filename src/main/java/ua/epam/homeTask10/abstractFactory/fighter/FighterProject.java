package ua.epam.homeTask10.abstractFactory.fighter;

import ua.epam.homeTask10.abstractFactory.ArmedAircraftFactory;
import ua.epam.homeTask10.abstractFactory.Engine;
import ua.epam.homeTask10.abstractFactory.Weapon;

public class FighterProject {

    public static void main(String[] args) {
        ArmedAircraftFactory fighterFactory = new FighterFactory();
        Engine engine = fighterFactory.getEngine();
        Weapon firstWeapon = fighterFactory.getWeapon();
        Weapon secondWeapon = fighterFactory.getAdditionalWeapon();

        System.out.println("Testing Fighter prototype:");
        engine.start();
        firstWeapon.fire();
        secondWeapon.fire();
    }
}
