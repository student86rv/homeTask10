package ua.epam.homeTask10.behavioralPatterns.memento;

public class PlayerBase {

    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
