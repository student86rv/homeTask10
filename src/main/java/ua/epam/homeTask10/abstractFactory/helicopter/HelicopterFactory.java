package ua.epam.homeTask10.abstractFactory.helicopter;

import ua.epam.homeTask10.abstractFactory.ArmedAircraftFactory;
import ua.epam.homeTask10.abstractFactory.Engine;
import ua.epam.homeTask10.abstractFactory.Weapon;

public class HelicopterFactory implements ArmedAircraftFactory {
    @Override
    public Engine getEngine() {
        return new TurboShaftEngine();
    }

    @Override
    public Weapon getWeapon() {
        return new AntiTankMissile();
    }

    @Override
    public Weapon getAdditionalWeapon() {
        return new MachineGun();
    }
}
