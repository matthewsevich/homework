package by.matusevich.task04;

public class NewPifagor {
    public static void main(String[] args) {
        int a =3;
        int b = 4;
        int r = 6;
        System.out.println("Сторона а " + a);
        System.out.println("Сторона б " + b);
        System.out.println("Радиус r " + r);

        String s = (((a * a) + (b * b)) <= ((r * 2)*(r*2))) ? "Можно" : "Нельзя";
        System.out.println(s);

    }
}
