package ua.epam.homeTask10.decorator;

public class Student implements Worker {

    @Override
    public String makeJob() {
        return "Install cable.";
    }
}
