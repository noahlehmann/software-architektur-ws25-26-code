package designprinciples.openclosed.good;

public class SilverCustomerDiscount extends DiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}