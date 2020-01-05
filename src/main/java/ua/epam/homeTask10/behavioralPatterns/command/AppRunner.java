package ua.epam.homeTask10.behavioralPatterns.command;

public class AppRunner {

    public static void main(String[] args) {
        TvReceiver tvReceiver = new TvReceiver();

        RemoteControl remoteControl = new RemoteControl(
                new VolumeUpCommand(tvReceiver),
                new VolumeDownCommand(tvReceiver),
                new NextChannelCommand(tvReceiver),
                new PrevChannelCommand(tvReceiver)
        );

        remoteControl.volumeUp();
        remoteControl.volumeDown();
        remoteControl.nextChannel();
        remoteControl.prevChannel();
    }
}
