package by.matusevich.task06;

import by.matusevich.task01.Utility;

public class Calendar {
    public static void main(String[] args) {
        int day = Utility.readNumber("Введите номер дня: ");
        int month = Utility.readNumber("Введите номер месяца: ");
        int year = Utility.readNumber("Введите номер года: ");

        boolean error = false;
        boolean leapYear = false;
        boolean longMonth;

        if (year % 4 == 0) {
            leapYear = true;
            if (year % 100 == 0)
                leapYear = false;
            if (year % 400 == 0)
                leapYear = true;
        }
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            longMonth = true;
        } else longMonth = false;


        if (((day < 0) || (month < 0)) ||
                ((day > 31) || (month > 12)) ||
                (((day >= 29) && (month == 2)) && (!leapYear)) ||
                ((day >= 30) && (month == 2)) || (!longMonth && (day > 30))) {
            error = true;
            System.out.println("error");
        } else if ((month == 2) && !error) {
            if (leapYear) {
                if (day == 29) {
                    day = 1;
                    month++;
                }
                if (day == 28) {
                    day++;
                }
            } else if (!leapYear) {
                if (day == 28) {
                    day = 1;
                    month++;
                }
            }
        } else if (longMonth && !error) {
            if (day == 31) {
                day = 1;
                month++;
                if (month == 13) {
                    month = 1;
                    year++;
                }
            } else day++;
        } else if (day == 30) {
            month++;
            day = 1;
        } else
            day++;
        if (!error) {


            System.out.println("leap year: " + leapYear);
            System.out.println("current date: " + day + "." + month + "." + year);
            System.out.println("tomorrow will be: " + day + "." + month + "." + year);
        }
    }
}
