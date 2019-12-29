package ua.epam.homeTask10.prototype;

public class CupFactory {

    Cup cup;

    public CupFactory(Cup cup) {
        this.cup = cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    Cup cloneCup() {
        return (Cup) cup.copy();
    }
}
