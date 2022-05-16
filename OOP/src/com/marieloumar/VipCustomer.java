package com.marieloumar;

public class VipCustomer {

    private String name;
    private long creditLimit;
    private String emailAddress;

    public VipCustomer(String name, long creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer() {
        this("Default Name", Long.MAX_VALUE, "Default Email");
    }


    public VipCustomer(String name, String emailAddress) {
        this(name, Long.MAX_VALUE, emailAddress);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
