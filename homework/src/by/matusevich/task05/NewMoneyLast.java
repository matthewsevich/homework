package by.matusevich.task05;

public class NewMoneyLast {
    public static void main(String[] args) {

        int x = 3;
        if ((x % 100 > 10) && (x % 100 < 15)) {
            System.out.println(x + " Рублей");
        } else if (x % 10 == 1) {
            System.out.println(x + " Рубль");
        } else if (1 < x % 10 && x % 10 < 5) {
            System.out.println(x + " Рубля");
        } else
            System.out.println(x + " Рублей");

    }
}