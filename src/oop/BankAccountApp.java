package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a new bank account >> think instantiate an object
		BankAccount acc1 = new BankAccount();
		
		// acc1.name = "Gritli Amine";
		// With encapsualtion
		acc1.setName("Gritli mohamed Amine");
		System.out.println(acc1.getName());
		acc1.setSsn("156567654");
		System.out.println("SSN:   " + acc1.getSsn());
		
		
		acc1.accountNumber = "034567";
		
		acc1.balance = 10000;
		
		acc1.setRate();
		acc1.increaseRate(); 
		 
		acc1.deposit(1500);
		//acc1.deposit(1500);
		//acc1.deposit(1500);
		//acc1.deposit(2000);
		
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("checking Account");
		acc2.accountNumber = "134565432";
		
		BankAccount acc3 = new BankAccount("Saving Account", 5000);
		acc3.accountNumber = "134565432";
		
		/*
		BankAccount acc2 = new BankAccount("checking Account");
		
		
		
		
		BankAccount acc3 = new BankAccount("Saving Account", 5000);
		acc3.checkBalance();
		acc3.deposit();
		// System.out.println("You identifiant is : " + acc3.identifiant);
		
		// Demo for inheritance
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Wiem";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/
		
		

	}

}
