package ua.epam.homeTask10.decorator;

public class AppRunner {

    public static void main(String[] args) {
        Worker worker = new Engineer(new Tecnician(new Student()));
        System.out.println(worker.makeJob());
    }
}
