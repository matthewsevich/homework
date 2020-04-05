package by.matusevich.task25;

import by.matusevich.task25.PaymentSystem.VisaCard;

public class GoldenVisaEMV extends VisaCard implements PayableWithEMV {
    @Override
    public void pay() {
        System.out.println("Pay for Smth");
    }

    @Override
    public void payWithEMV() {
        System.out.println("Pay contactless with EMV");
    }

    @Override
    public String getCardHolderName() {
        return super.getCardHolderName();
    }

    @Override
    public void setCardHolderName(String cardHolderName) {
        super.setCardHolderName(cardHolderName);
    }

    public static void main(String[] args) {


        GoldenVisaEMV card1 = new GoldenVisaEMV();
        System.out.println("card1 payment system is " + card1.PaymentOrganization);
        card1.setCardHolderName("Boris the Blade");
        card1.pay();
        card1.payWithEMV();
        System.out.print("cardHolderName is " + card1.getCardHolderName());

    }


}
