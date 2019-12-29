package ua.epam.homeTask10.builder;

public abstract class PersonBuilder {

    Person person;

    public void createPerson() {
        person = new Person();
    }

    abstract void buildName();
    abstract void buildRace();
    abstract void buildStrength();
    abstract void buildDexterity();
    abstract void buildEndurance();

    public Person getPerson() {
        return person;
    }
}
