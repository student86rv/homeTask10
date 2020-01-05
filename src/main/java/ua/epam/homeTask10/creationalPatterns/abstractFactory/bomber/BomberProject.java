package ua.epam.homeTask10.creationalPatterns.abstractFactory.bomber;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.ArmedAircraftFactory;
import ua.epam.homeTask10.creationalPatterns.abstractFactory.Engine;
import ua.epam.homeTask10.creationalPatterns.abstractFactory.Weapon;

public class BomberProject {

    public static void main(String[] args) {
        ArmedAircraftFactory bomberFactory = new BomberFactory();
        Engine engine = bomberFactory.getEngine();
        Weapon firstWeapon = bomberFactory.getWeapon();
        Weapon secondWeapon = bomberFactory.getAdditionalWeapon();

        System.out.println("Testing Bomber prototype:");
        engine.start();
        firstWeapon.fire();
        secondWeapon.fire();
    }
}
