package by.matusevich.task08;

import by.matusevich.task02.WeekConverter;

class Factorial {
    public static void main(String[] args) {

        int input = WeekConverter.readNumber("Введите число факториал которого нужно вычислить ");
        long fac = 1;
        int i = 1;

        while (i <= input) {
            fac *= i;
            i++;
        }
        System.out.println("Для числа = " + (i - 1) + " факториал равен " + fac);
        }
    }

