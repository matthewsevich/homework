package by.matusevich.task03;

import by.matusevich.task01.Utility;

public class NewLastDigit {
    public static void main(String[] args) {
        int input = Utility.readNumber("Введите число, последнюю цифру которого вы хотите проверить на 7");
        int x = Math.abs(input);
        String s = (x % 10 == 7) ? "у числа = " + input + " последняя - цифра 7" : "у числа = " + input + "  последняя - цифра не 7";
        System.out.println(s);
    }
}