package by.matusevich.task19;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        String first = readString("Введите строку для подсчета слов");
        String str = first + " ";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((Character.isLetter(str.charAt(i))) && !(Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }

        }
        System.out.println("Number of words in sentence is: " + count);

    }

    static String readString(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
