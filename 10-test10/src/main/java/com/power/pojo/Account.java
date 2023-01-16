package com.power.pojo;

public class Account {
    private String accountid;
    private Double balance;

    public Account() {
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Account(String accountid, Double balance) {
        this.accountid = accountid;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountid='" + accountid + '\'' +
                ", balance=" + balance +
                '}';
    }
}