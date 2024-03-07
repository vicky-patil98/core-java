package com.learning.core.day4;
//D04P01-2
public class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws NegativeAmountException, LowBalanceException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (accType.equals("Saving") && initialBalance < 1000 && initialBalance >=0) {
            throw new LowBalanceException();
        } else if (accType.equals("Current") && initialBalance < 5000 && initialBalance >=0) {
            throw new LowBalanceException();
        }
        if (initialBalance < 0) {
            throw new NegativeAmountException();
        }
        this.balance = initialBalance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException();
        }
        balance += amt;
    }

    public float getBalance() throws LowBalanceException {
        if (accType.equals("Saving") && balance < 1000) {
            throw new LowBalanceException();
        } else if (accType.equals("Current") && balance < 5000) {
            throw new LowBalanceException();
        }
        return balance;
    }
}
