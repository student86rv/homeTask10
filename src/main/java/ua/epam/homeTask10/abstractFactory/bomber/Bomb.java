package ua.epam.homeTask10.abstractFactory.bomber;

import ua.epam.homeTask10.abstractFactory.Weapon;

public class Bomb implements Weapon {
    @Override
    public void fire() {
        System.out.println("Bomb was dropped!");
    }
}
