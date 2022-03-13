package me.whiteship.refactoring._09_feature_envy;

public class GasUsage {

    private double amount;

    private double pricePerUnit;

    public GasUsage(double amount, double pricePerUnit) {
        this.amount = amount;
        this.pricePerUnit = pricePerUnit;
    }

    public double getGasBill() {
        var gasBill = this.getAmount() * this.getPricePerUnit();
        return gasBill;
    }

    public double getAmount() {
        return amount;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
