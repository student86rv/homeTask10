package ua.epam.homeTask10.creationalPatterns.builder;

public class Person {

    private String name;
    private Race race;
    private int strength;
    private int dexterity;
    private int endurance;

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", race=" + race +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", endurance=" + endurance +
                '}';
    }
}
