package by.matusevich.task25;

public class Main {
    public static void main(String[] args) {

        Refrigerator fridge = new Refrigerator();
        System.out.println(fridge.size);
        fridge.plugIn();
        fridge.cooling();
    }
}
