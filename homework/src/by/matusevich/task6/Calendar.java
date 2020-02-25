package by.matusevich.task6;

public class Calendar {
    public static void main(String[] args) {
        int d = 28;
        int m = 2;
        int y = 1600;
        boolean error = false;

        boolean leapYear = false;
        if (y % 4 == 0) {
            leapYear = true;
            if (y % 100 == 0)
                leapYear = false;
            if (y % 400 == 0)
                leapYear = true;
        }

        System.out.println("leap year: " + leapYear);
        System.out.println("current date: " + d + "." + m + "." + y);
        if (((d < 0) || (m < 0)) ||
                ((d > 31) || (m > 12)) ||
                (((d >= 29) && (m == 2)) && (!leapYear))) {
            error = true;
            System.out.println("error");
        } else if ((m == 2) && !error) {
            System.out.println("feb");
            if (leapYear) {
                System.out.println("feb - vis");
                if (d == 29) {
                    d = 1;
                    m++;
                }
                if (d == 28) {
                    d++;
                }
            } else if (!leapYear) {
                System.out.println("feb - nevis");
                if (d == 28) {
                    d = 1;
                    m++;
                }
            }
        } else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && !error) {
            System.out.println("31d - month");
            if (d == 31) {
                System.out.println("31 = last day");
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
        if (!error)
            System.out.println("tomorrow will be: " + d + "." + m + "." + y);
    }
}
