package ua.epam.homeTask10.structuralPatterns.facade;

public class Car {

    public void move(TrafficLight trafficLight) {
        if (trafficLight.isGreenLight()) {
            System.out.println("Car is moving!");
        }else {
            System.out.println("Car stopped at traffic light!");
        }
    }
}
