package by.matusevich.task04;


import java.util.Scanner;

public class NewPifagor {
    public static void main(String[] args) {
        int a=readNumber("Введите первую сторону квадратного отверстия");
        int b=readNumber("Введите вторую сторону квадратного отверстия");
        int r=readNumber("Введите радиус круглой картонки");

        System.out.println("Сторона a: " + a);
        System.out.println("Сторона b: " + b);
        System.out.println("Радиус r: " + r);

        String s = (((a * a) + (b * b)) <= ((r * 2)*(r*2))) ? "Можно закрыть отверстие" : "Нельзя закрыть отверстие";
        System.out.println(s);

    }
    static int readNumber(String msg){
        System.out.println(msg);
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}
