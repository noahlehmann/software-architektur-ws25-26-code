package designprinciples.openclosed.good;

public class DiscountCalculator {
    private final IDiscountPolicy discountPolicy;

    public DiscountCalculator(IDiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public double applyDiscount(double amount) {
        double discount = discountPolicy.calculateDiscount(amount);
        return amount - discount;
    }
}