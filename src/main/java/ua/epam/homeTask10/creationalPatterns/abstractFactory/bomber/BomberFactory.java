package ua.epam.homeTask10.creationalPatterns.abstractFactory.bomber;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.ArmedAircraftFactory;
import ua.epam.homeTask10.creationalPatterns.abstractFactory.Engine;
import ua.epam.homeTask10.creationalPatterns.abstractFactory.Weapon;

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
