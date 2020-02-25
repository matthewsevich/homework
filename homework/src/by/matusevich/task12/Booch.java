package by.matusevich.task12;

public class Booch {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 1000_000_000);
        int digit = 0;
        int i = 0;
        int y = 0;
        System.out.println(x);
        while (x != 0) {
            y = y * 10 + x % 10;
            x /= 10;
            System.out.println("first cycle " + x);
            System.out.println("first cycle " + y);
        }
        System.out.println(y);

        while (y != 0) {
            digit = y % 10;
            y /= 10;
            System.out.print(digit);
            i++;
            if (i % 3 == 0)
                System.out.print(" ");

        }

    }
}
