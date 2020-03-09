package by.matusevich.task06;

import by.matusevich.task01.Utility;

public class Calendar {
    public static void main(String[] args) {
        int d = Utility.readNumber("Введите номер дня: ");
        int m = Utility.readNumber("Введите номер месяца: ");
        int y = Utility.readNumber("Введите номер года: ");

        boolean error = false;
        boolean leapYear = false;

        if (y % 4 == 0) {
            leapYear = true;
            if (y % 100 == 0)
                leapYear = false;
            if (y % 400 == 0)
                leapYear = true;
        }


        if (((d < 0) || (m < 0)) ||
                ((d > 31) || (m > 12)) ||
                (((d >= 29) && (m == 2)) && (!leapYear))) {
            error = true;
            System.out.println("error");
        } else if ((m == 2) && !error) {
            if (leapYear) {
                if (d == 29) {
                    d = 1;
                    m++;
                }
                if (d == 28) {
                    d++;
                }
            } else if (!leapYear) {
                if (d == 28) {
                    d = 1;
                    m++;
                }
            }
        } else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && !error) {
            if (d == 31) {
                d = 1;
                m++;
                if (m == 13) {
                    m = 1;
                    y++;
                }
            } else d++;
        } else if (d == 30) {
            m++;
            d = 1;
        } else
            d++;
        if (!error) {


            System.out.println("leap year: " + leapYear);
            System.out.println("current date: " + d + "." + m + "." + y);
            System.out.println("tomorrow will be: " + d + "." + m + "." + y);
        }
    }
}
