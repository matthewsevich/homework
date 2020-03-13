package by.matusevich.task25;

public class Refrigerator extends MajorAppliance implements Refrigeratorable {

    public Refrigerator() {

    }

    @Override
    public void plugIn() {
        System.out.println("plugged in");
    }

    @Override
    public void cooling() {
        System.out.println("Cooling");
    }

}
