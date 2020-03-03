package by.matusevich.task11;

import java.util.Scanner;

public class NewSimple {

    public static void main(String[] args) {
        String yesNo = "Y";
        while ("Y".equals(yesNo)) {

            int input = readNumber("Введите целое число: ");
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
            yesNo = readString("Continue yes (Y) no (N)");
            if (!"Y".equals(yesNo)) {

                System.exit(0);
            }
        }
    }

    static int readNumber(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static String readString(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


}