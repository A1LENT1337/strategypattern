package PaymentMethod;

import Interface.PaymentStrategy;

public class PaymentByKaspi implements PaymentStrategy {
    private String phoneNumber;
    private int balance;

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setBalance(int balance) { this.balance = balance; }
    public int getBalance() { return balance; }

    @Override
    public void collectPaymentDetails() {
    }

    @Override
    public boolean validatePaymentDetails() {
        return phoneNumber != null && phoneNumber.startsWith("+7");
    }

    @Override
    public void pay(int amount) {
        balance -= amount;
    }

    @Override
    public String getMethodName() {
        return "payment by Kaspi";
    }
}
