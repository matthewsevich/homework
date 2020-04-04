package by.matusevich.task31;

public class Main {

    public static void main(String[] args) {
        ReadFromFile readFromFile = new ReadFromFile();
        String data = readFromFile.readFromFile("file.txt");
        NumberFinder.Finder(data);
    }
}
