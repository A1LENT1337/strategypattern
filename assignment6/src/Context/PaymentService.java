package Context;

import Interface.PaymentStrategy;

public class PaymentService {
    private PaymentStrategy strategy;
    private String message;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public String getMessage() {
        return message;
    }

    public void processOrder(int amount) {
        if (strategy == null) {
            message = "Payment method not selected!";
            return;
        }

        strategy.collectPaymentDetails();

        if (!strategy.validatePaymentDetails()) {
            message = "Invalid payment details!";
            return;
        }

        strategy.pay(amount);
        message = "Payment successful: " + amount + " ₸ using " + strategy.getMethodName();
    }
}
