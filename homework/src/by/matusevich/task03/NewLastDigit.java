package by.matusevich.task03;

import java.util.Scanner;

public class NewLastDigit {
    public static void main(String[] args) {
        int input=readNumber("Введите число, последнюю цифру которого вы хотите проверить на 7");
        String s = (input % 10 == 7) ? "у числа = " +input+" последняя - цифра 7" : "у числа = " +input+"  последняя - цифра не 7";
        System.out.println(s);
    }
    static int readNumber(String msg){
        System.out.println(msg);
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}