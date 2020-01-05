package ua.epam.homeTask10.behavioralPatterns.chainOfResponsibility;

public class AppRUnner {

    public static void main(String[] args) {
        Support support1 = new SupportSpecialist(1);
        Support support2 = new Engineer(2);
        Support support3 = new Director(3);

        support1.setNextSupport(support2);
        support2.setNextSupport(support3);

        support1.solveProblem("I did something wrong!", 1);
        support1.solveProblem("It works too slowly!", 2);
        support1.solveProblem("It doesn't turn on!", 3);
    }
}
