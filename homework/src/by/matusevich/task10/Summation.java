package by.matusevich.task10;

class Summation {
    public static void main(String[] args) {
        int x = (int)(Math.random()*1000_000);
        int digit = 0;
        System.out.println(x);

            while (x != 0){

            digit += x % 10;
            x = x/10;

        }            System.out.println("Сумма цифр " + digit);

    }
}
