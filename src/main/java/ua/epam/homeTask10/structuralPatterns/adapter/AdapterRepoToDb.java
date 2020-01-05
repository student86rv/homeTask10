package ua.epam.homeTask10.structuralPatterns.adapter;

public class AdapterRepoToDb extends FileRepository implements Database {

    @Override
    public void create() {
        addUser();
    }

    @Override
    public void read() {
        getUser();
    }

    @Override
    public void update() {
        updateUser();
    }

    @Override
    public void delete() {
        deleteUser();
    }
}
