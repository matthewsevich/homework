package by.matusevich.task08;

import by.matusevich.task01.Utility;

import java.math.BigInteger;

class Factorial {
    public static void main(String[] args) {

        int input = Utility.readNumber("Введите число факториал которого нужно вычислить ");
        BigInteger fac = BigInteger.ONE;
        int i = 1;

        while (i <= input) {
            fac = fac.multiply(BigInteger.valueOf(i));
            i++;
        }
        System.out.println("Для числа = " + (i - 1) + " факториал равен " + fac);
    }
}


