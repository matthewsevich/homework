package by.matusevich.task12;

public class Booch {
    public static void main(String[] args) {
        int x = 100000;
        int digit;
        int i = 0;
        int y = 1;
        int count = 0;
        System.out.println("исходный х= "+x);
        for (;x != 0;x/=10) {
            y = y * 10 + x % 10;
            count++;
        }
        System.out.println("перевернутый х= "+y);

        for (;y != 1;y/=10) {
            digit = y % 10;
            System.out.print(digit);
            i++;
            if ((count-i)%3==0)
                System.out.print(" ");
        }

    }
}
