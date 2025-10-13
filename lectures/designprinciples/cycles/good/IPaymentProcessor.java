package designprinciples.cycles.good;

public interface IPaymentProcessor {
    void processPayment(int orderId, double total);
}
