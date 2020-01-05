package ua.epam.homeTask10.chainOfResponsibility;

public class SupportSpecialist extends Support {

    public SupportSpecialist(int complexity) {
        super(complexity);
    }

    @Override
    public void reply(String problem) {
        System.out.println("Support specialist tried to solve your problem: "
                + problem);
    }
}
