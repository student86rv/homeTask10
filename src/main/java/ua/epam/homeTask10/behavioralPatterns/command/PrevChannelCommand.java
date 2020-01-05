package ua.epam.homeTask10.behavioralPatterns.command;

public class PrevChannelCommand implements Command {

    private TvReceiver tvReceiver;

    public PrevChannelCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.switchPreviousChannel();
    }
}
