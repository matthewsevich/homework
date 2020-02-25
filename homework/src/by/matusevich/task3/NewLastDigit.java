package by.matusevich.task3;

public class NewLastDigit {
    public static void main(String[] args) {

        int x = (int) (Math.random()*1000);
        String s = (x % 10 == 7) ? "у ИКС = " +x+" последняя - цифра 7" : "у ИКС = " +x+"  последняя - цифра не 7";
        System.out.println(s);

    }
}