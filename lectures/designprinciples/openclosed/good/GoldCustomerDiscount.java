package designprinciples.openclosed.good;

public class GoldCustomerDiscount extends DiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.20;
    }
}