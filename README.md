# Banking_System_CoreJava
Project Description : eBank – Banking System Project is a model Banking Application. This application enables the customers to perform banking transactions. This application provides employeess to perforfm banking transcation, manage customer, accounts in efficent maaner.

=======================================
POJO
========================================
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

==========================================
Main calss
===========================================
package com.vishal.main;

import java.util.ArrayList;
import java.util.Scanner;
import com.vishal.pojo.Account;

public class MainBank {

	public static void main(String[] args) {
		int choice;
		
		String name, place;
		int amount, accountno;
		boolean found;

		Scanner scanner = new Scanner(System.in);
//		ArrayList<Account> list = new ArrayList<>();
		ArrayList<Account> list =new ArrayList<>();

		
		//anonymus class
		list.add(new Account("Vishal", "Mumbai", 10000));
		list.add(new Account("Padma", "Mumbai", 50000));
		list.add(new Account("Tata", "Mumbai", 20000));

		System.out.println(
				"=========================================================================================================");
		System.out.println(
				"=========================================================================================================");
		System.out.println("Select your Operations");
		System.out.println("1.Open Account");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Balance Enquiry");
		System.out.println("5.List All Details");
		System.out.println("6.Exit");
		System.out.println(
				"=========================================================================================================");
		System.out.println(
				"=========================================================================================================");
		do {
			System.out.println("Enter Your Choice:=");

			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("--------------Account Open---------------------------");

				System.out.println("Enter  NAme:=");
				name = scanner.next();

				scanner.nextLine();
				System.out.println("Enter City:= ");
				place = scanner.next();

				System.out.println("Enter Amount");
				amount = scanner.nextInt();

				Account account = new Account(name, place, amount);
				list.add(account);

//				System.out.println("Enter Nam: =");
//				name = scanner.next();
//				scanner.nextLine();// mandatory mindgte1
//
//				System.out.println("Enter City.: =");
//				place = scanner.next();
//
//				System.out.println("Enter Amount.: =");
//				amount = scanner.nextInt();
//
//				Account account = new Account(name, place, amount);
//				list.add(account);

				break;

			case 2:
				System.out.println("--------------Deposit Balance---------------------------");
				found = false;
				System.out.println("Enter Account Number: =");
				accountno = scanner.nextInt();
				for (Account a : list) {
					if (accountno == a.getAccountno()) {
						found = true;
						System.out.println("Customer Name: =" + a.getName());
						System.out.println("Place Name: =" + a.getPlace());
						System.out.println("Account Balance: =" + a.getBalance());
						System.out.println("************* Amount to Deposit******************");
						System.out.println("Enter amount to Deposit: = ");
						amount = scanner.nextInt();
						a.setBalance(a.getBalance() + amount); // amount is deposited
						System.out.println("Deposit Successfull...!!!! ");
						System.out.println("Your  Balance After  Deposit is  : =" + a.getBalance());
						break;
					}

				}
				if (!found) {
					System.out.println("Invalid Account number!!!");
				}

				break;

			case 3:
				System.out.println("--------------Withdraw Amount---------------------------");
				found = false;

				System.out.println("Enter Account Number: =");
				accountno = scanner.nextInt();

				for (Account a : list) {
					if (accountno == a.getAccountno()) {
						found = true;
						System.out.println("Customer Name : = " + a.getName());
						System.out.println("Customer Place : =" + a.getPlace());
						System.out.println("Amount to be Withdraw: : =" + a.getBalance());

						System.out.println("************* Amount to withdraw******************");

						System.out.println("Enter Amount to withdraw := ");
						amount = scanner.nextInt();
						// for withdraw condition
						if (amount <= a.getBalance()) {
							a.setBalance(a.getBalance() - amount);
							System.out.println("WithDraw Succesfully");
							System.out.println("Your  Balance After WithDraw is := " + a.getBalance());
						} else {
							System.out.println("Amount is Insufficient to withdraw!!!!");

						}

						break;
					}

				}
				if (!found) {
					System.out.println("Invalid Account number!!!");
				}

				break;

			case 4:
				System.out.println("--------------Balance Enquiry---------------------------");
				found = false;
				System.out.println("Enter Account number: =");
				accountno = scanner.nextInt();

				for (Account a : list) {
					if (accountno == a.getAccountno()) {
						found = true;

						System.out.println("Customer Name:=" + a.getName());
						System.out.println("Customer Place := " + a.getPlace());
						System.out.println("Amount " + a.getBalance());

					}
				}
				if (!found) {
					System.out.println("Invalid Account number!!!");
				}

				break;

			case 5:
				System.out.println("--------------List All Details---------------------------");

				for (Account ac : list) {
					System.out.println(ac);
				}
				break;

			case 6:
				System.out.println("--------------Thanks for visiting ---------------------------");
				break;

			default:
				System.out.println("--------------Invalid Choice--------------------------");
				break;

			}
		} while (choice != 6);

	}

}

=================================
