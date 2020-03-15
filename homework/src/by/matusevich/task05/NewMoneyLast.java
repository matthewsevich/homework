package by.matusevich.task05;

import by.matusevich.task01.Utility;

public class NewMoneyLast {
    public static void main(String[] args) {
        int x = Utility.readNumber("Введите количество рублей");
        int y = Math.abs(x);
        if ((y % 100 > 10) && (y % 100 < 15)) {
            System.out.println(x + " Рублей");
        } else if (y % 10 == 1) {
            System.out.println(x + " Рубль");
        } else if (1 < y % 10 && y % 10 < 5) {
            System.out.println(x + " Рубля");
        } else
            System.out.println(x + " Рублей");
    }
}