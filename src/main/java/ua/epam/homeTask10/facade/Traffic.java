package ua.epam.homeTask10.facade;

public class Traffic {
    Car car = new Car();
    TrafficLight trafficLight = new TrafficLight();

    public void startTraffic() {
        trafficLight.startTraffic();
        car.move(trafficLight);
    }
}
