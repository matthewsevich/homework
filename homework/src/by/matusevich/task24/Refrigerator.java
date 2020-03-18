package by.matusevich.task24;

public class Refrigerator extends MajorAppliance implements Refrigeratorable {

    public Refrigerator() {

    }

    private boolean isOn;

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }

    public boolean getState() {
        return isOn;
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
