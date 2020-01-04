package ua.epam.homeTask10.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {

    List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createGame() {
        for (Developer developer : developers) {
            developer.develop();
        }
    }
}
