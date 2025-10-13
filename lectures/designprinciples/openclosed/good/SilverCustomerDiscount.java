package designprinciples.openclosed.good;

public class SilverCustomerDiscount implements IDiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}