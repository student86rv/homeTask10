package ua.epam.homeTask10.factory;

public class AppRunner {

    public static void main(String[] args) {

        CarFactory carFactory = createCarByModel("ford");
        Car car = carFactory.createCar();
        car.printName();
    }

    public static CarFactory createCarByModel(String model) {
        if (model.equalsIgnoreCase("ford")) {
            return new FordFactory();
        } else if (model.equalsIgnoreCase("mazda")) {
            return new MazdaFactory();
        } else if (model.equalsIgnoreCase("opel")) {
            return new OpelFactory();
        } else {
            throw new IllegalArgumentException(model + " is unknown model!");
        }
    }
}
