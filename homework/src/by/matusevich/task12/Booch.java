package by.matusevich.task12;

public class Booch {
    public static void main(String[] args) {
        int x = 12345678;
        int digit;
        int i = 0;
        int y = 0;
        int count = 0;
        System.out.println(x);
        while (x != 0) {
            y = y * 10 + x % 10;
            x /= 10;
            count++;

        }
        System.out.println(y);

        while (y != 0) {
            digit = y % 10;
            y /= 10;
            System.out.print(digit);
            i++;
            if ((count-i)%3==0)
                System.out.print(" ");

        }

    }
}
