package ua.epam.homeTask10.behavioralPatterns.command;

public class RemoteControl {

    private Command volumeUpCommand;
    private Command volumeDownCommand;
    private Command nextChannelCommand;
    private Command prevChannelCommand;

    public RemoteControl(Command volumeUpCommand, Command volumeDownCommand,
                         Command nextChannelCommand, Command prevChannelCommand) {
        this.volumeUpCommand = volumeUpCommand;
        this.volumeDownCommand = volumeDownCommand;
        this.nextChannelCommand = nextChannelCommand;
        this.prevChannelCommand = prevChannelCommand;
    }

    public void volumeUp() {
        volumeUpCommand.execute();
    }

    public void volumeDown() {
        volumeDownCommand.execute();
    }

    public void nextChannel() {
        nextChannelCommand.execute();
    }

    public void prevChannel() {
        prevChannelCommand.execute();
    }
}
