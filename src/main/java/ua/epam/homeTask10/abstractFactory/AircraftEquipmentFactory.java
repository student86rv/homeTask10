package ua.epam.homeTask10.abstractFactory;

public interface AircraftEquipmentFactory {
    Engine getEngine();
    Weapon getWeapon();
}
