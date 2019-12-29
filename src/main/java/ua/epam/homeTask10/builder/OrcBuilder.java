package ua.epam.homeTask10.builder;

public class OrcBuilder extends PersonBuilder {

    @Override
    void buildName() {
        person.setName("Petr");
    }

    @Override
    void buildRace() {
        person.setRace(Race.ORC);
    }

    @Override
    void buildStrength() {
        person.setStrength(17);
    }

    @Override
    void buildDexterity() {
        person.setDexterity(10);
    }

    @Override
    void buildEndurance() {
        person.setEndurance(18);
    }
}
