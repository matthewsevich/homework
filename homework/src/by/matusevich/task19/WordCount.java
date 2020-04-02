package by.matusevich.task19;

import by.matusevich.task01.Utility;

public class WordCount {
    public static void main(String[] args) {
        String first = Utility.readString("Введите строку для подсчета слов");
        wordCount(first);
    }

    public static String wordCount(String data) {
        String str = data + " ";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((Character.isLetter(str.charAt(i))) && !(Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }

        }
        System.out.println("Number of words in sentence is: " + count);
        return null;
    }

}
