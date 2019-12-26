package ua.epam.homeTask10.factory;

public class MazdaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Mazda();
    }
}
