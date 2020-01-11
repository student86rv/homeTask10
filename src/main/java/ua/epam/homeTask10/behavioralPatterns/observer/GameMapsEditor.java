package ua.epam.homeTask10.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class GameMapsEditor implements Observed {

    private List<String> maps = new ArrayList<>();
    private List<Observer> players = new ArrayList<>();

    public void addMap(String gameMap) {
        this.maps.add(gameMap);
        notifyObservers();
    }

    public void removeMap(String gameMap) {
        this.maps.remove(gameMap);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.players.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.players.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : players) {
            observer.handleEvent(this.maps);
        }
    }
}
