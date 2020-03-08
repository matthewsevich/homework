package by.matusevich.task07;

import static by.matusevich.task02.WeekConverter.readNumber;

public class Cottages {
    public static void main(String[] args) {

        int a, b, c, d;
        int e, f;

        a = readNumber("Введите сторону A: ");
        c = readNumber("Введите сторону B: ");
        b = readNumber("Введите сторону C: ");
        d = readNumber("Введите сторону D: ");
        e = readNumber("Введите сторону E: ");
        f = readNumber("Введите сторону F: ");

        boolean permission = false;
        if (a * b * c * d * e * f <= 0) {
            System.out.println("ERROR");
        } else if (((a + c) <= e) && ((b + d) <= f))
            permission = true;
        else if (((a + d) <= e) && ((b + c) <= f))
            permission = true;
        else if (((a + c) <= f) && ((b + d) <= e))
            permission = true;
        else if (((a + d) <= f) && ((b + c) <= e))
            permission = true;
        else if ((a * b + c * d) <= e * f)  // по площади
            permission = true;

        if (permission)
            System.out.println("можно");
        else System.out.println("нельзя");

    }
}
