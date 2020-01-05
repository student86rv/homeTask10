package ua.epam.homeTask10.creationalPatterns.abstractFactory.bomber;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.Weapon;

public class Bomb implements Weapon {
    @Override
    public void fire() {
        System.out.println("Bomb was dropped!");
    }
}
