package by.matusevich.task01;

import java.util.Scanner;

public class Utility {
    public static void main(String[] args) {

    }

    public static int readNumber(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String readString(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
