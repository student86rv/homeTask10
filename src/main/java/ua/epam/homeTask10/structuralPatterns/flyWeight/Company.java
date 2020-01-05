package ua.epam.homeTask10.structuralPatterns.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloper(String specialty) {
        Developer developer = developers.get(specialty);
        if (developer == null) {
            switch(specialty) {
                case "software":
                    System.out.println("New Software developer joined project!");
                    developer = new SoftwareDeveloper();
                    break;
                case "graphic":
                    System.out.println("New Graphic Animator joined project!");
                    developer = new GraphicAnimator();
                    break;
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
