package by.matusevich.task31;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {

    public String readFromFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            System.out.println("Available: " + fis.available());
            byte[] bytes = new byte[fis.available()];
            int bytesCount = fis.read(bytes);
            System.out.println("Read: " + bytesCount);
            return new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ReadFromFile readFromFile = new ReadFromFile();
        String data = readFromFile.readFromFile("file.txt");
        System.out.println("Data= " + data);
        NumberFinder.NubmberFinder(data);
    }
}