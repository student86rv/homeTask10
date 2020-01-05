package ua.epam.homeTask10.structuralPatterns.facade;

public class TrafficLight {

    private boolean greenLight;

    public boolean isGreenLight() {
        return greenLight;
    }

    public void startTraffic() {
        System.out.println("Traffic allowed!");
        greenLight = true;
    }

    public void stopTraffic() {
        System.out.println("Movement prohibited!");
        greenLight = false;
    }
}
