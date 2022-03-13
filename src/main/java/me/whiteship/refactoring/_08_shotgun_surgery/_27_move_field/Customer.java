package me.whiteship.refactoring._08_shotgun_surgery._27_move_field;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {

    private String name;

    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.contract = new CustomerContract(dateToday(), discountRate);
    }

    public double getDiscountRate() {
        return this.getContract().getDiscountRate();
    }

    public void becomePreferred() {
        this.getContract().setDiscountRate(this.getDiscountRate() + 0.03);
        // 다른 작업들
    }
    public double applyDiscount(double amount) {
        BigDecimal value = BigDecimal.valueOf(amount);
        return value.subtract(value.multiply(BigDecimal.valueOf(getDiscountRate()))).doubleValue();
    }

    private LocalDate dateToday() {
        return LocalDate.now();
    }

    public CustomerContract getContract() {
        return contract;
    }
}
