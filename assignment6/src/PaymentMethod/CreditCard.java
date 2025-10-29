package PaymentMethod;

public class CreditCard {
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private int amount;

    public CreditCard() {}

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getExpiryDate() { return expiryDate; }
    public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

    public String getCvv() { return cvv; }
    public void setCvv(String cvv) { this.cvv = cvv; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }
}
