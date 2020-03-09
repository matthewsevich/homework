package by.matusevich.task10;

import by.matusevich.task01.Utility;

class Summation {
    public static void main(String[] args) {

        int x = Utility.readNumber("Введите число для которого, следует посчитать сумму цифр");
        int digit = 0;

        if (x < 0) {
            System.out.println("х<0 поэтому используется |x|");
            x = Math.abs(x);
            System.out.print("для х = " + x);
        }
        while (x != 0) {

            digit += x % 10;
            x = x / 10;

        }
        System.out.println(". Сумма цифр =" + digit);

    }
}
