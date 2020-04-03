package by.matusevich.task23;


public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(10, 20, 50);

        bankomat.printBalance();
        bankomat.addMoney(170);//вывод сколько и каких купюр добавляется в банкомат
        bankomat.printBalance();

        System.out.println(bankomat.completeOperation(20000));
        bankomat.printBalance();
        System.out.println(bankomat.completeOperation(3000));
        bankomat.printBalance();
        System.out.println(bankomat.completeOperation(3000));
        bankomat.printBalance();


    }


}

