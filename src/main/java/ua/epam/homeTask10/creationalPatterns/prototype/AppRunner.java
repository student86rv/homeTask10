package ua.epam.homeTask10.creationalPatterns.prototype;

public class AppRunner {

    public static void main(String[] args) {
        Cup cup = new Cup(Color.BLUE, 95, 75);
        System.out.println(cup);

        CupFactory cupFactory = new CupFactory(cup);
        Cup cloneCup = cupFactory.cloneCup();
        System.out.println(cloneCup);
    }
}
