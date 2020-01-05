package ua.epam.homeTask10.chainOfResponsibility;

public class Director extends Support {

    public Director(int complexity) {
        super(complexity);
    }

    @Override
    public void reply(String problem) {
        System.out.println("Director tried to solve your problem: " + problem);
    }
}
