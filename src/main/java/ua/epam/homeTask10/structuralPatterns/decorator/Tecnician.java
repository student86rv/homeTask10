package ua.epam.homeTask10.structuralPatterns.decorator;

public class Tecnician extends WorkerDecorator {

    public Tecnician(Worker worker) {
        super(worker);
    }

    public String connectDevices() {
        return "Connect devices.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + connectDevices();
    }
}
