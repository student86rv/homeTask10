package ua.epam.homeTask10.command;

public class VolumeDownCommand implements Command {

    private TvReceiver tvReceiver;

    public VolumeDownCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.decreaseVolume();
    }
}
