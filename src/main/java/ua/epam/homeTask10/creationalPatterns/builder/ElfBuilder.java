package ua.epam.homeTask10.creationalPatterns.builder;

public class ElfBuilder extends PersonBuilder {

    @Override
    void buildName() {
        person.setName("Nikolai");
    }

    @Override
    void buildRace() {
        person.setRace(Race.ELF);
    }

    @Override
    void buildStrength() {
        person.setStrength(10);
    }

    @Override
    void buildDexterity() {
        person.setDexterity(20);
    }

    @Override
    void buildEndurance() {
        person.setEndurance(15);
    }
}
