package by.matusevich.task25;

public abstract class PaymentCard {

    int expirationDate;
    int cardNumber;
    String cardHolderName;
    String PaymentOrganization;

    public abstract void pay();

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }


}
