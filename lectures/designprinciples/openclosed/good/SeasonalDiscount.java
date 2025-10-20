package designprinciples.openclosed.good;

public class SeasonalDiscount extends DiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}