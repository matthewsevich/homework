package by.matusevich.task02;

import java.util.Scanner;

public class WeekConverter {

    public static void main(String[] args) {
        int input = readNumber("Insert amount of seconds you want to convert to weeks: ");

        if (input < 0)
            System.out.println(" ERROR");

        int sec;
        int m, min;
        int h, hour;
        int d, day;
        int w;

        sec = input % 60;
        m = (input - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        w = (d - day) / 7;
        System.out.println(w + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
    }

    public static int readNumber(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}