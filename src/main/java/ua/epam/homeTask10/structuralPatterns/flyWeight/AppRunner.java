package ua.epam.homeTask10.structuralPatterns.flyWeight;

import java.util.ArrayList;
import java.util.List;

public class AppRunner {

    public static void main(String[] args) {
        Company company = new Company();

        List<Developer> developers = new ArrayList<>();

        developers.add(company.getDeveloper("software"));
        developers.add(company.getDeveloper("software"));
        developers.add(company.getDeveloper("software"));
        developers.add(company.getDeveloper("graphic"));
        developers.add(company.getDeveloper("graphic"));
        developers.add(company.getDeveloper("graphic"));

        for (Developer developer : developers) {
            developer.develop();
        }
    }
}
