package by.matusevich.task33;

import java.io.File;
import java.util.Objects;

public class FileFinder {
    public static void main(String[] args) {
        File folder = new File("d:/");
        System.out.println("файлы");
        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
        System.out.println("директории");
        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (file.isDirectory()) {
                System.out.println(file.getName());
            }
        }


    }
}
