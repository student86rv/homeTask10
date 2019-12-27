package ua.epam.homeTask10.singleton;

import java.io.*;

public class FileRepository {

    private static FileRepository fileRepository;

    public static synchronized FileRepository getInstance() {
        if (fileRepository == null) {
            fileRepository = new FileRepository();
        }
        return fileRepository;
    }

    private FileRepository() {
    }

    public String readFile() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String currentLine;
            while ((currentLine = reader.readLine()) != null){
                sb.append(currentLine);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void writeFile(String input) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            writer.write(input);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
