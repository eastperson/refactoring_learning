package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate;

public class PremiumDelegate {

    private Booking host;

    private PremiumExtra premiumExtra;

    public PremiumDelegate(Booking host, PremiumExtra premiumExtra) {
        this.host = host;
        this.premiumExtra = premiumExtra;
    }

    public boolean hasTalkback() {
        return host.show.hasOwnProperty("talkback");
    }

    public double extendsBasePrice(double result) {
        return Math.round(result + this.premiumExtra.getPremiumFee());
    }

    public PremiumExtra getPremiumExtra() {
        return premiumExtra;
    }

    public boolean hasDinner() {
        return this.premiumExtra.hasOwnProperty("dinner") && !host.isPeakDay();
    }
}
