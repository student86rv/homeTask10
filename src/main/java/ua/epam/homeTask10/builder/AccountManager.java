package ua.epam.homeTask10.builder;

public class AccountManager {

    PersonBuilder builder;

    public void setBuilder(PersonBuilder builder) {
        this.builder = builder;
    }

    Person buildPerson() {
        builder.createPerson();
        builder.buildName();
        builder.buildRace();
        builder.buildStrength();
        builder.buildDexterity();
        builder.buildEndurance();

        return builder.getPerson();
    }
}
