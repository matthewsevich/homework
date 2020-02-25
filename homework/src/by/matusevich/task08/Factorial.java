package by.matusevich.task08;

class Factorial {
    public static void main(String[] args) {

        long fac = 1;
        int i = 1;

        while (i <= 20) {
            fac *= i;
        i++;
        }
        System.out.println("Для i = " + (i-1) + " факториал равен " + fac);
        }
    }

