package ua.epam.homeTask10.abstractFactory.fighter;

import ua.epam.homeTask10.abstractFactory.Weapon;

public class Missile implements Weapon {
    @Override
    public void fire() {
        System.out.println("Missile was launched!");
    }
}
