package ua.epam.homeTask10.decorator;

public class WorkerDecorator implements Worker{

    Worker worker;

    public WorkerDecorator(Worker worker) {
        this.worker = worker;
    }

    @Override
    public String makeJob() {
        return worker.makeJob();
    }
}
