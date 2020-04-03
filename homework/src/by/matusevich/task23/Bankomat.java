package by.matusevich.task23;

public class Bankomat {

    private int hundreds;
    private int fifties;
    private int twenties;

    public int cash() {

        return (hundreds * 100) + (fifties * 50) + (twenties * 20);
    }

    public Bankomat(int hundreds, int fifties, int twenties) {
        this.hundreds = hundreds;
        this.fifties = fifties;
        this.twenties = twenties;
    }

    public void addMoney(int addingMoney) {
        int hundr = addingMoney / 100;
        int fifts = (addingMoney - hundr * 100) / 50;
        int twent = (addingMoney - hundr * 100 - fifts * 50) / 20;

        System.out.println("кол-во добавляемых 100: " + hundr);
        System.out.println("кол-во добавляемых 50: " + fifts);
        System.out.println("кол-во добавляемых 20: " + twent);
        this.hundreds += hundr;
        System.out.println("текущее кол-во 100: " + this.hundreds);

        this.fifties += fifts;
        System.out.println("текущее кол-во 50: " + this.fifties);

        this.twenties += twent;
        System.out.println("текущее кол-во 20: " + this.twenties);

    }

    public void printBalance() {
        System.out.println("в банкомате денег: " + cash());
    }

    public boolean completeOperation(int targetAmount) {
        int cash = cash();
        if (cash - targetAmount >= 0) {
            int hundredsGiven;
            int fiftiesGiven;
            int twentiesGiven;
            if (targetAmount / 100 >= this.hundreds) {
                hundredsGiven = this.hundreds;

            } else hundredsGiven = targetAmount / 100;
            if ((targetAmount - this.hundreds * 100) / 50 >= this.fifties) {
                fiftiesGiven = this.fifties;
            } else fiftiesGiven = (targetAmount - hundredsGiven * 100) / 50;
            if (((targetAmount - this.hundreds * 100 - this.fifties * 50) / 20) >= this.twenties) {
                twentiesGiven = this.twenties;
            } else twentiesGiven = (targetAmount - hundredsGiven * 100 - fiftiesGiven * 50) / 20;

            this.hundreds -= hundredsGiven;
            this.fifties -= fiftiesGiven;
            this.twenties -= twentiesGiven;
            System.out.println("выдано купюр по 100: " + hundredsGiven);
            System.out.println("выдано купюр по 50: " + fiftiesGiven);
            System.out.println("выдано купюр по 20: " + twentiesGiven);
            return true;
        }

        return false;
    }
}
