package by.matusevich.task04;

import by.matusevich.task01.Utility;

public class NewPifagor {
    public static void main(String[] args) {
        int a = Utility.readNumber("Введите первую сторону квадратного отверстия");
        int b = Utility.readNumber("Введите вторую сторону квадратного отверстия");
        int r = Utility.readNumber("Введите радиус круглой картонки");

        System.out.println("Сторона a: " + a);
        System.out.println("Сторона b: " + b);
        System.out.println("Радиус r: " + r);
        if (a > 0 && b > 0 && r > 0) {
            String s = (((a * a) + (b * b)) <= ((r * 2) * (r * 2))) ? "Можно закрыть отверстие" : "Нельзя закрыть отверстие";
            System.out.println(s);
        } else System.out.println("Ошибка! Введите числа большие чем 0");


    }

}
