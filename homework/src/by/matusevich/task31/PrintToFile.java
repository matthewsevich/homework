package by.matusevich.task31;

import by.matusevich.task01.Utility;

import java.io.FileOutputStream;
import java.io.IOException;

public class PrintToFile {

    public boolean printToFile(String data, String fileName) {

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data.getBytes());
            fos.flush();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = Utility.readString("Введите текст для записывания в файл");
        boolean result = new PrintToFile().printToFile(text, "file.txt");
        if (result)
            System.out.println("Finished");
        else System.out.println("Error");
    }

}