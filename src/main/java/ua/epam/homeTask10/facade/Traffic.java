package ua.epam.homeTask10.facade;

public class Traffic {
    private Car car = new Car();
    private TrafficLight trafficLight = new TrafficLight();

    public void startTraffic() {
        trafficLight.startTraffic();
        car.move(trafficLight);
    }
}
