package ua.epam.homeTask10.behavioralPatterns.memento;

public class Player {

    private final int INITIAL_HEALTH = 100;
    private final int INITIAL_AMMO = 30;

    private String name;
    private int health;
    private int ammo;

    public Player(String name) {
        this.name = name;
        this.health = INITIAL_HEALTH;
        this.ammo = INITIAL_AMMO;
    }

    public Save save(){
        return new Save(name, health, ammo);
    }

    public void load(Save save) {
        this.name = save.getName();
        this.health = save.getHealth();
        this.ammo = save.getAmmo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", ammo=" + ammo +
                '}';
    }
}
