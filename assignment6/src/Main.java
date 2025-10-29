import Context.PaymentService;
import PaymentMethod.*;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        // Kaspi
        PaymentByKaspi kaspi = new PaymentByKaspi();
        kaspi.setPhoneNumber("+77051234567");
        kaspi.setBalance(10000);
        service.setStrategy(kaspi);
        service.processOrder(3000);
        System.out.println(service.getMessage());

        // Cash
        PaymentByCash cash = new PaymentByCash();
        cash.setCashierName("Aidar");
        cash.setCashAvailable(true);
        service.setStrategy(cash);
        service.processOrder(2000);
        System.out.println(service.getMessage());

        // Card
        CreditCard card = new CreditCard();
        card.setCardNumber("1234 5678 9876 5432");
        card.setExpiryDate("12/30");
        card.setCvv("321");
        card.setAmount(15000);

        PaymentByCreditCard credit = new PaymentByCreditCard();
        credit.setCard(card);
        service.setStrategy(credit);
        service.processOrder(5000);
        System.out.println(service.getMessage());
    }
}
