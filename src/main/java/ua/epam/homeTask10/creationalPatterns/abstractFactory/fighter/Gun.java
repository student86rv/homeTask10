package ua.epam.homeTask10.creationalPatterns.abstractFactory.fighter;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.Weapon;

public class Gun implements Weapon {
    @Override
    public void fire() {
        System.out.println("Gun is shooting!");
    }
}
