package ua.epam.homeTask10.creationalPatterns.abstractFactory.fighter;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.Weapon;

public class Missile implements Weapon {
    @Override
    public void fire() {
        System.out.println("Missile was launched!");
    }
}
