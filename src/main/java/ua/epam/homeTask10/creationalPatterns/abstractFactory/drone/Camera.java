package ua.epam.homeTask10.creationalPatterns.abstractFactory.drone;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.Weapon;

public class Camera implements Weapon {
    @Override
    public void fire() {
        System.out.println("Camera's recording video!");
    }
}
