package ua.epam.homeTask10.abstractFactory.fighter;

import ua.epam.homeTask10.abstractFactory.AircraftEquipmentFactory;
import ua.epam.homeTask10.abstractFactory.Engine;
import ua.epam.homeTask10.abstractFactory.Weapon;

public class FighterEquipmentFactory implements AircraftEquipmentFactory {
    @Override
    public Engine getEngine() {
        return new TurboJet();
    }

    @Override
    public Weapon getWeapon() {
        return new Missile();
    }
}
