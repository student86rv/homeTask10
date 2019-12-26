package ua.epam.homeTask10.abstractFactory;

public interface ArmedAircraftFactory extends AircraftFactory {
    Weapon getAdditionalWeapon();
}
