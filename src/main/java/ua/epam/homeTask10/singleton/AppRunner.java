package ua.epam.homeTask10.singleton;

public class AppRunner {

    public static void main(String[] args) {
        FileRepository.getInstance().writeFile("Text file:");

        System.out.println(FileRepository.getInstance().readFile());
    }
}
