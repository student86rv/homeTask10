package ua.epam.homeTask10.behavioralPatterns.strategy;

public class Player {

    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.makeMove();
    }
}
