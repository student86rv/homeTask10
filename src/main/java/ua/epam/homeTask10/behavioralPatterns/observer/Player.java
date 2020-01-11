package ua.epam.homeTask10.behavioralPatterns.observer;

import java.util.List;

public class Player implements Observer {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> maps) {
        System.out.println("Dear " + name + "!" + "\n" +
                "Please check for new game maps:" + "\n" + maps);
    }
}
