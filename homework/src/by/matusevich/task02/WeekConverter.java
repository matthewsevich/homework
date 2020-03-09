package by.matusevich.task02;

import by.matusevich.task01.Utility;

public class WeekConverter {

    public static void main(String[] args) {
        int input = Utility.readNumber("Insert amount of seconds you want to convert to weeks: ");

        if (input < 0)
            System.out.println(" ERROR");
        else {
            int sec, m, min, h, hour, d, day, w;


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
    }
}