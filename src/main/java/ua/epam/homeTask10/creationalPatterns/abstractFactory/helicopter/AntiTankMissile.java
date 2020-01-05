package ua.epam.homeTask10.creationalPatterns.abstractFactory.helicopter;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.Weapon;

public class AntiTankMissile implements Weapon {
    @Override
    public void fire() {
        System.out.println("Anti-tank guided missile was launched!");
    }
}
