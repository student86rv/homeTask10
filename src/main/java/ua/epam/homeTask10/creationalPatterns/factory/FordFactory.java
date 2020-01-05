package ua.epam.homeTask10.creationalPatterns.factory;

public class FordFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Ford();
    }
}
