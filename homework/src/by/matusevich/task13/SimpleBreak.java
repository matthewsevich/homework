package by.matusevich.task13;

import by.matusevich.task01.Utility;

public class SimpleBreak {

    public static void main(String[] args) {
        String yesNo = "Y";
        while ("Y".equals(yesNo)) {

            int input = Utility.readNumber("Введите целое число: ");
            boolean b = true;

            if (input < 0) {
                System.out.println(" Ошибка");
            } else
                for (int i = 2; i < input; i++) {
                    if ((input % i) == 0) {
                        b = false;
                        break;
                    } else b = true;


                }
            if (b) System.out.println(input + " простое число");
            else System.out.println(input + " не простое число");
            yesNo = Utility.readString("Continue yes (Y) no (N)");
            if (!"Y".equals(yesNo)) {

                System.exit(0);
            }
        }
    }
}