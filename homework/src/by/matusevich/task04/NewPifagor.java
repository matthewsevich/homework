package by.matusevich.task04;


import by.matusevich.task02.WeekConverter;


public class NewPifagor {
    public static void main(String[] args) {
        int a = WeekConverter.readNumber("Введите первую сторону квадратного отверстия");
        int b = WeekConverter.readNumber("Введите вторую сторону квадратного отверстия");
        int r = WeekConverter.readNumber("Введите радиус круглой картонки");

        System.out.println("Сторона a: " + a);
        System.out.println("Сторона b: " + b);
        System.out.println("Радиус r: " + r);

        String s = (((a * a) + (b * b)) <= ((r * 2) * (r * 2))) ? "Можно закрыть отверстие" : "Нельзя закрыть отверстие";
        System.out.println(s);

    }

}
