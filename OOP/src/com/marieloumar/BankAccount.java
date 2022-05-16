package com.marieloumar;

import java.math.BigInteger;

public class BankAccount {
    BigInteger defaultBalance = new BigInteger("0");


    private String accountNumber;
    private BigInteger balance = new BigInteger("0");
    private String customerName;
    private String email;
    private String phoneNumber;




    public String getAccountNumber() {
        return accountNumber;
    }


    public BankAccount(){
        this("56789", "Default Name", "Default Email", "Default Phone Number");
        System.out.println("Empty account created.");
    }

    public BankAccount(String accountNumber, BigInteger balance, String customerName, String email, String phoneNumber){
        System.out.println("Creating account...");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

        System.out.println("Account created for " + this.getCustomerName() + " successfully.");
    }


    public BankAccount(String accountNumber, String customerName, String email, String phoneNumber){
        System.out.println("Creating account...");
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

        System.out.println("Account created for " + this.getCustomerName() + " successfully.\nPlease deposit an amount into your account to activate it");
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigInteger getBalance() {
        return balance;
    }

    public void setBalance(BigInteger balance) {
        this.balance = this.balance.add(balance);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void depositFunds(BigInteger amount){
        BigInteger minimum = new BigInteger("0");
        if(this.balance.compareTo(minimum) != 0) {
            this.balance = this.balance.add(amount);
        }
        System.out.println("You have deposited " + amount + " into your account.\nYour new balance is " + this.balance);
    }

    public void withdrawFunds(BigInteger amount){
        BigInteger minimum = new BigInteger("0");
        if(this.balance.compareTo(minimum) != 0){
            this.balance = this.balance.subtract(amount);
        }

        System.out.println("You have withdrawn " + amount + "from your account.\nYour new balance is " + this.balance);
    }
}
