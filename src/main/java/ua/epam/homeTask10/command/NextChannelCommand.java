package ua.epam.homeTask10.command;

public class NextChannelCommand implements Command {

    private TvReceiver tvReceiver;

    public NextChannelCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.switchNextChannel();
    }
}
