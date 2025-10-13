package designprinciples.cycles.bad;

public class Payment {
    private Order order;

    void process(Order order) {
        this.order = order;
        System.out.println("Processing payment for order " + order.toString());
    }
}
