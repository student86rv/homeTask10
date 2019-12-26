package ua.epam.homeTask10.abstractFactory.helicopter;

import ua.epam.homeTask10.abstractFactory.Weapon;

public class MachineGun implements Weapon {
    @Override
    public void fire() {
        System.out.println("Machine gun is shooting");
    }
}
