package me.whiteship.refactoring._16_temporary_field._36_introduce_special_case;

public class Site {

    private Customer customer;

    public Site(Customer customer) {
        if (customer.isUnknown()) {
            this.customer = new UnknownCustomer();
        } else {
            this.customer = customer;
        }
    }

    public Customer getCustomer() {
        return customer;
    }
}
