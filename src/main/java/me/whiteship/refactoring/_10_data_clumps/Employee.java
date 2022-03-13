package me.whiteship.refactoring._10_data_clumps;

public class Employee {

    private String name;

    private String personalAreaCode;

    private String personalNumber;

    private TelephoneNumber personalPhoneNumber;

    public Employee(String name, String personalAreaCode, String personalNumber, TelephoneNumber personalPhoneNumber) {
        this.name = name;
        this.personalAreaCode = personalAreaCode;
        this.personalNumber = personalNumber;
        this.personalPhoneNumber = personalPhoneNumber;
    }

    public TelephoneNumber getPersonalPhoneNumber() {
        return personalPhoneNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
