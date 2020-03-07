package by.matusevich.task12;

import by.matusevich.task02.WeekConverter;

public class Booch {
    public static void main(String[] args) {
        int x = WeekConverter.readNumber("Введите число для вывода его в \" бухгалтерском\" формате ");
        System.out.println("приложенние работает только для чисел >0 & <1000_000_000");
        int digit;
        int i = 0;
        int y = 1;
        int count = 0;
        if (x < 0) {
            System.out.println("ERROR");
        } else
            for (; x != 0; x /= 10) {
                y = y * 10 + x % 10;
                count++;
            }

        for (; y != 1; y /= 10) {
            digit = y % 10;
            System.out.print(digit);
            i++;
            if ((count - i) % 3 == 0)
                System.out.print(" ");
        }

    }
}
