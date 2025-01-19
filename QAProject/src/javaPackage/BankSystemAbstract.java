package javaPackage;

public class BankSystemAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount myAccount = new SavingAccount(500.0, "SA12345");

		// Access public methods (Data Abstraction in action)
		myAccount.displayDetails();
		myAccount.deposit(200.0);
		myAccount.withdraw(100.0);
		System.out.println("Final Balance: $" + myAccount.checkbalance());
	}
	

}


abstract class BankAccount{
	private double balance;
	BankAccount(double intbalance){
			balance=intbalance;	
	}
	
	
	void deposit(double amount)
	{
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}
	
	void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: $" + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}
	
	double checkbalance() {
		
		return balance;
		
	}
	
	abstract void displayDetails();
	
}


class SavingAccount extends BankAccount {

	String accountNumber;
	SavingAccount(double intbalance,String accountNumber) {
		super(intbalance);
		
		this.accountNumber = accountNumber;
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Savings Account Number: " + accountNumber);
		System.out.println("Current Balance: $" + checkbalance());
	}
	
}
