package by.matusevich.task24;

public class Main {
    public static void main(String[] args) {

        Refrigerator fridge = new Refrigerator();
        System.out.println(fridge.size);
        fridge.plugIn();
        fridge.on();
        System.out.println(fridge.getState());
        fridge.cooling();
        fridge.off();
        System.out.println(fridge.getState());
    }
}
