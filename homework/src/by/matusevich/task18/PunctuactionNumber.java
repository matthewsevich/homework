package by.matusevich.task18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuactionNumber {
    public static void main(String[] args) {
        String str = readString("Введите строку, для подсчета знаков препинания");
        Pattern pattern = Pattern.compile("[!.,;:?\\-]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }

    static String readString(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
