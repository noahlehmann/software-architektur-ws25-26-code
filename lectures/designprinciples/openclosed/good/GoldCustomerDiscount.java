package designprinciples.openclosed.good;

public class GoldCustomerDiscount implements IDiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.20;
    }
}