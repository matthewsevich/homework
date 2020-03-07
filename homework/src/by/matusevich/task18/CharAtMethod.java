package by.matusevich.task18;

import java.util.Scanner;

public class CharAtMethod {
    public static void main(String[] args) {
        String str = readString("Введите строку для подсчета знаков препинания");
        int n = 0;
        char symbol;

        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if ((symbol == ',') || (symbol == '.')
                    || (symbol == '?') || (symbol == '!')
                    || (symbol == ':') || (symbol == ';')
                    || (symbol == '-'))
                n++;
        }
        System.out.println(" У нас есть " + n + " знаков препинания");
    }

    static String readString(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
