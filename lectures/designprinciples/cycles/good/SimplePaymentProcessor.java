package designprinciples.cycles.good;

public class SimplePaymentProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(int orderId, double total) {
        System.out.println("Payment for orderId: " + orderId + ", total: " + total);
    }
}