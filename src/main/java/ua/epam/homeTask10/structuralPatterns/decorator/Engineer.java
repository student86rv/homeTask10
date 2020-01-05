package ua.epam.homeTask10.structuralPatterns.decorator;

public class Engineer extends WorkerDecorator {

    public Engineer(Worker worker) {
        super(worker);
    }

    public String configureNetwork() {
        return "Configure network.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + configureNetwork();
    }
}
