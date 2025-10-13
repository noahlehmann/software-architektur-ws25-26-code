package designprinciples.cycles.good;

public class Order {
    private final IPaymentProcessor processor;

    Order(IPaymentProcessor processor) {
        this.processor = processor;
    }

    void complete() {
        processor.processPayment(getId(), getTotal());
    }

    double getTotal() {
        return 100.0;
    }

    int getId() {
        return (int) (Math.random() * 100);
    }
}
