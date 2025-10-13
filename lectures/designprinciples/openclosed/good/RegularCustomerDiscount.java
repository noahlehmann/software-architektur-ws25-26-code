package designprinciples.openclosed.good;

public class RegularCustomerDiscount implements IDiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.0; // No discount
    }
}