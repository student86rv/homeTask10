package ua.epam.homeTask10.behavioralPatterns.memento;

public class Save {

    private final String name;
    private final int health;
    private final int ammo;

    public Save(String name, int health, int ammo) {
        this.name = name;
        this.health = health;
        this.ammo = ammo;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAmmo() {
        return ammo;
    }
}
