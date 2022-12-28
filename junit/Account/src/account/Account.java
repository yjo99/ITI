/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author SD-Amany
 */
public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double withdrawAmount) {
		this.balance = balance - withdrawAmount;
	}

	public void deposit(double depositAmount) {
		this.balance = balance + depositAmount;
	}

public static void main(String[] args) {
        // TODO code application logic here
	System.out.println("Hello");
    }
    
}
