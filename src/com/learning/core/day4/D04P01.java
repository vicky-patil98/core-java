package com.learning.core.day4;
//D04P01-1
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
