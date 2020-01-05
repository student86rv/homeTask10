package ua.epam.homeTask10.creationalPatterns.abstractFactory.fighter;

import ua.epam.homeTask10.creationalPatterns.abstractFactory.ArmedAircraftFactory;
import ua.epam.homeTask10.creationalPatterns.abstractFactory.Engine;
import ua.epam.homeTask10.creationalPatterns.abstractFactory.Weapon;

public class FighterFactory implements ArmedAircraftFactory {
    @Override
    public Engine getEngine() {
        return new TurboJet();
    }

    @Override
    public Weapon getWeapon() {
        return new Missile();
    }

    @Override
    public Weapon getAdditionalWeapon() {
        return new Gun();
    }
}
