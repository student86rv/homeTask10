package ua.epam.homeTask10.creationalPatterns.abstractFactory.bomber;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.Weapon;

public class CruiseMissile implements Weapon {
    @Override
    public void fire() {
        System.out.println("Cruise Missile was launched!");
    }
}
