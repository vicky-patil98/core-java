package com.learning.core.day4;
//D04P01-1

class NegativeAmountException extends Exception {
    public NegativeAmountException() {
        super("NegativeAmount");
    }
}

class LowBalanceException extends Exception {
    public LowBalanceException() {
        super("LowBalance");
    }
}

class BankAccount {
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

public class D04P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            BankAccount account1 = new BankAccount(123, "John", "Saving", 900);
            account1.deposit(100);
            System.out.println("Balance after deposit: " + account1.getBalance());
        } catch (NegativeAmountException | LowBalanceException e) {
            System.out.println("Output 1:");
            System.out.println(e.getMessage());
        }
        
        try {
            BankAccount account2 = new BankAccount(123, "John", "Saving", -900);
        } catch (NegativeAmountException | LowBalanceException e) {
            System.out.println("Output 2:");
            System.out.println(e.getMessage());
        }
	}

}
