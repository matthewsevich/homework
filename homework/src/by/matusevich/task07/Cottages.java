package by.matusevich.task07;

import by.matusevich.task01.Utility;


public class Cottages {
    private static int max(int first, int second) {
        return first > second ? first : second;
    }

    // can I fit [x, y] to [to_x, to_y]
    private static boolean can_fit(int x, int y, int to_x, int to_y) {
        return (x <= to_x && y <= to_y) || (x <= to_y && y <= to_x);
    }

    private static boolean have_permission(int a, int b, int c, int d, int e, int f) {
        if (can_fit(max(a, c), b + d, e, f) ||
                can_fit(max(a, d), b + c, e, f) ||
                can_fit(max(b, c), a + d, e, f) ||
                can_fit(max(b, d), a + c, e, f)) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        int a, b, c, d;
        int e, f;
        a = Utility.readNumber("Введите сторону A: ");
        c = Utility.readNumber("Введите сторону B: ");
        b = Utility.readNumber("Введите сторону C: ");
        d = Utility.readNumber("Введите сторону D: ");
        e = Utility.readNumber("Введите сторону E: ");
        f = Utility.readNumber("Введите сторону F: ");


        if (have_permission(a, b, c, d, e, f)) {
            System.out.println("можно");
        } else {
            System.out.println("нельзя");
        }
    }
}