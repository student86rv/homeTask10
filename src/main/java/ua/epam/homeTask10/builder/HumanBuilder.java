package ua.epam.homeTask10.builder;

public class HumanBuilder extends PersonBuilder {

    @Override
    void buildName() {
        person.setName("Vasili");
    }

    @Override
    void buildRace() {
        person.setRace(Race.HUMAN);
    }

    @Override
    void buildStrength() {
        person.setStrength(15);
    }

    @Override
    void buildDexterity() {
        person.setDexterity(15);
    }

    @Override
    void buildEndurance() {
        person.setEndurance(15);
    }
}
