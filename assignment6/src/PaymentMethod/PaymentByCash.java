package PaymentMethod;

import Interface.PaymentStrategy;

public class PaymentByCash implements PaymentStrategy {
    private String cashierName;
    private boolean cashAvailable;

    public void setCashierName(String cashierName) { this.cashierName = cashierName; }
    public void setCashAvailable(boolean cashAvailable) { this.cashAvailable = cashAvailable; }

    @Override
    public void collectPaymentDetails() {
    }

    @Override
    public boolean validatePaymentDetails() {
        return cashAvailable;
    }

    @Override
    public void pay(int amount) {
    }

    @Override
    public String getMethodName() {
        return "payment by Cash";
    }
}
