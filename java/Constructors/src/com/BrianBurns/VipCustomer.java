package com.BrianBurns;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String emailAddress;
    //Default constructor that sets up default values.
    public VipCustomer() {
        this("Default Name", "50000", "default@email.com");
    }
    //Takes name and creditLimit from above, adds custom emailAddress
    public VipCustomer(String name, String creditLimit) {
        this(name, creditLimit, "unknown");
    }
    //Constructor that sets all custom values.
    public VipCustomer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {

        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
