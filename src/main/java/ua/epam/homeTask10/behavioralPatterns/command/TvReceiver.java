package ua.epam.homeTask10.behavioralPatterns.command;

public class TvReceiver {

    public void increaseVolume() {
        System.out.println("TV increased volume level...");
    }

    public void decreaseVolume() {
        System.out.println("TV decreased volume level...");
    }

    public void switchNextChannel() {
        System.out.println("TV switched next channel...");
    }

    public void switchPreviousChannel() {
        System.out.println("TV switched previous channel...");
    }
}
