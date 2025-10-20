package designprinciples.openclosed.good;

public class DiscountCalculator {
    private final DiscountPolicy discountPolicy;

    public DiscountCalculator(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public double applyDiscount(double amount) {
        double discount = discountPolicy.calculateDiscount(amount);
        return amount - discount;
    }
}