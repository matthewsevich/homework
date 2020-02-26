package by.matusevich.task12;

public class Booch {
    public static void main(String[] args) {
        int x = 9876;
        int digit;
        int i = 0;
        int y = 1;
        int count = 0;
        System.out.println("исходный х= "+x);
        while (x != 0) {
            y = y * 10 + x % 10;
            x /= 10;
            count++;

        }
        System.out.println("перевернутый х= "+y);

        while (y != 1) {
            digit = y % 10;
            y /= 10;
            System.out.print(digit);
            i++;
            if ((count-i)%3==0)
                System.out.print(" ");

        }

    }
}
