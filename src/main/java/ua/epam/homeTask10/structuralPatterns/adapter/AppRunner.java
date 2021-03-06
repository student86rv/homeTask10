package ua.epam.homeTask10.structuralPatterns.adapter;

public class AppRunner {

    public static void main(String[] args) {
        Database database = new AdapterRepoToDb();

        database.create();
        database.read();
        database.update();
        database.delete();
    }
}
