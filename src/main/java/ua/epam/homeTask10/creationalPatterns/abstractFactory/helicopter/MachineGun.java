package ua.epam.homeTask10.creationalPatterns.abstractFactory.helicopter;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.Weapon;

public class MachineGun implements Weapon {
    @Override
    public void fire() {
        System.out.println("Machine gun is shooting");
    }
}
