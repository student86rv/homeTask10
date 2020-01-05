package ua.epam.homeTask10.chainOfResponsibility;

public class Engineer extends Support {

    public Engineer(int complexity) {
        super(complexity);
    }

    @Override
    public void reply(String problem) {
        System.out.println("Engineer tried to solve your problem: " + problem);
    }
}
