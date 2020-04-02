package by.matusevich.task12;

import by.matusevich.task01.Utility;

public class Booch {
    public static void main(String[] args) {
        System.out.println("приложение корректно работает только для чисел >0 и меньших на 1 разряд чем макимальное значение интеджера");
        int x = Utility.readNumber("Введите число для вывода его в \" бухгалтерском\" формате ");
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
