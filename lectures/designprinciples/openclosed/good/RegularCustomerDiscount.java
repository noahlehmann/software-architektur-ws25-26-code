package designprinciples.openclosed.good;

public class RegularCustomerDiscount extends DiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.0; // No discount
    }
}