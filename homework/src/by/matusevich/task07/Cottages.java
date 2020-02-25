package by.matusevich.task07;

public class Cottages {
    public static void main(String[] args) {
        int a, b, c, d;
        int e, f;
        a = 1;
        c = 1;
        b = 2;
        d = 2;
        e = 2;
        f = 2;
        boolean permission = false;

        if (((a + c) <= e) && ((b + d) <= f)) {
            permission = true;
        } else if (((a + d) <= e) && ((b + c) <= f)) {
            permission = true;
        } else if (((a + c) <= f) && ((b + d) <= e)) {
            permission = true;
        } else if (((a + d) <= f) && ((b + c) <= e)) {
            permission = true;
        } else if ((a * b + c * d) <= e * f) { // по площади
            permission = true;
        }
        if (permission)
            System.out.println("можно");
        else System.out.println("нельзя");

    }
}
