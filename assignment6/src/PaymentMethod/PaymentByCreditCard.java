package PaymentMethod;

import Interface.PaymentStrategy;

public class PaymentByCreditCard implements PaymentStrategy {
    private CreditCard card;

    public void setCard(CreditCard card) {
        this.card = card;
    }

    @Override
    public void collectPaymentDetails() {
    }

    @Override
    public boolean validatePaymentDetails() {
        return card != null &&
                card.getCardNumber() != null &&
                card.getCvv() != null &&
                card.getExpiryDate() != null;
    }

    @Override
    public void pay(int amount) {
        card.setAmount(card.getAmount() - amount);
    }

    @Override
    public String getMethodName() {
        return "payment by Credit Card";
    }

}
