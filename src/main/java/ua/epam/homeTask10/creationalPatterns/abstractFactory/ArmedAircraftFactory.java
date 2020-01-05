package ua.epam.homeTask10.creationalPatterns.abstractFactory;

public interface ArmedAircraftFactory extends AircraftFactory {
    Weapon getAdditionalWeapon();
}
