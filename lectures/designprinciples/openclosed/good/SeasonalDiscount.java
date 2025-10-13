package designprinciples.openclosed.good;

public class SeasonalDiscount implements IDiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}