package by.matusevich.task07;

import by.matusevich.task01.Utility;

public class Cottages {
    public static void main(String[] args) {

        int a, b, c, d;
        int e, f;

        a = Utility.readNumber("Введите сторону A: ");
        c = Utility.readNumber("Введите сторону B: ");
        b = Utility.readNumber("Введите сторону C: ");
        d = Utility.readNumber("Введите сторону D: ");
        e = Utility.readNumber("Введите сторону E: ");
        f = Utility.readNumber("Введите сторону F: ");

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
