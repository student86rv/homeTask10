package ua.epam.homeTask10.behavioralPatterns.state;

public class Player {

    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Move) {
            setActivity(new Attack());
        } else if (activity instanceof Attack) {
            setActivity(new Defend());
        } else if (activity instanceof Defend) {
            setActivity(new Restore());
        } else if (activity instanceof Restore) {
            setActivity(new Move());
        }
    }

    public void makeMove() {
        activity.makeMove();
    }
}
