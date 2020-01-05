package ua.epam.homeTask10.creationalPatterns.abstractFactory;

public interface AircraftFactory {
    Engine getEngine();
    Weapon getWeapon();
}
