package ua.epam.homeTask10.command;

public class VolumeUpCommand implements Command {

    private TvReceiver tvReceiver;

    public VolumeUpCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.increaseVolume();
    }
}
