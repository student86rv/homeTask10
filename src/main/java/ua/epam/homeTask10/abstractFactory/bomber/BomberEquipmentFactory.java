package ua.epam.homeTask10.abstractFactory.bomber;

import ua.epam.homeTask10.abstractFactory.AircraftEquipmentFactory;
import ua.epam.homeTask10.abstractFactory.Engine;
import ua.epam.homeTask10.abstractFactory.Weapon;

public class BomberEquipmentFactory implements AircraftEquipmentFactory {
    @Override
    public Engine getEngine() {
        return new PropellerTurbine();
    }

    @Override
    public Weapon getWeapon() {
        return new Bomb();
    }
}
