package com.javapractice;

import java.awt.MultipleGradientPaint.CycleMethod;

public class Bank {
	static int currentBalance = 5000;
	public static void greetCustomer() {
		System.out.println("Hello,Wlecome to the banking application");
	}
	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("amount deposit successfully");
	}
	public static void withdraw(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("amount withdrawn successfully");
		
	}
	public int getCurrentBalance (){
		return currentBalance;
		
	}
	public static void main (String[] args) {
		Bank bank = new Bank();
		greetCustomer();
		System.out.println("current balance :-" + bank.getCurrentBalance());
		bank.deposit(1500);
		System.out.println("current balance :-" + bank.getCurrentBalance());
		withdraw(2500);
		System.out.println("current balance :-" + bank.getCurrentBalance());
	}
}
