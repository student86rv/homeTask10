package ua.epam.homeTask10.factory;

public class OpelFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Opel();
    }
}
