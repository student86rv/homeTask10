package ua.epam.homeTask10.abstractFactory.helicopter;

import ua.epam.homeTask10.abstractFactory.AircraftEquipmentFactory;
import ua.epam.homeTask10.abstractFactory.Engine;
import ua.epam.homeTask10.abstractFactory.Weapon;

public class HelicopterEquipmentFactory implements AircraftEquipmentFactory {
    @Override
    public Engine getEngine() {
        return new TurboShaftEngine();
    }

    @Override
    public Weapon getWeapon() {
        return new AntiTankMissile();
    }
}
