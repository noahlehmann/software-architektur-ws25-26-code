package designprinciples.cycles.bad;

public class Order {
    private Payment payment;

    void setPayment(Payment payment) {
        this.payment = payment;
    }

    void complete() {
        payment.process(this); // depends on Payment
    }
}
