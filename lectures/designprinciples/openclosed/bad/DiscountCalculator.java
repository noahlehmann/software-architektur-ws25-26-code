package designprinciples.openclosed.bad;

public class DiscountCalculator {

    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("REGULAR")) {
            return amount * 0.0;
        } else if (customerType.equals("SILVER")) {
            return amount * 0.10;
        } else if (customerType.equals("GOLD")) {
            return amount * 0.20;
        }
        // Every new customer type requires modifying this class!
        return 0.0;
    }
}