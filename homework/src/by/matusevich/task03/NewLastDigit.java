package by.matusevich.task03;

import by.matusevich.task02.WeekConverter;


public class NewLastDigit {
    public static void main(String[] args) {
        int input = WeekConverter.readNumber("Введите число, последнюю цифру которого вы хотите проверить на 7");
        String s = (input % 10 == 7) ? "у числа = " + input + " последняя - цифра 7" : "у числа = " + input + "  последняя - цифра не 7";
        System.out.println(s);
    }
}