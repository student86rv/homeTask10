package ua.epam.homeTask10.abstractFactory.bomber;

import ua.epam.homeTask10.abstractFactory.ArmedAircraftFactory;
import ua.epam.homeTask10.abstractFactory.Engine;
import ua.epam.homeTask10.abstractFactory.Weapon;

public class BomberFactory implements ArmedAircraftFactory {
    @Override
    public Engine getEngine() {
        return new PropellerTurbine();
    }

    @Override
    public Weapon getWeapon() {
        return new Bomb();
    }

    @Override
    public Weapon getAdditionalWeapon() {
        return new CruiseMissile();
    }
}
