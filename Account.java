package com.vishal.pojo;

public class Account {

	private int accountno;
	
	private static int saccountno=1001;
	
	private String name;
	private String place;
	private int balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String name, String place, int balance) {
		super();
		this.name = name;
		this.place = place;
		this.balance = balance;
		
		this.accountno=saccountno++;// autoincreament
		
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public static int getSaccountno() {
		return saccountno;
	}
	public static void setSaccountno(int saccountno) {
		Account.saccountno = saccountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", name=" + name + ", place=" + place + ", balance=" + balance + "]";
	}
	
	
	
}
