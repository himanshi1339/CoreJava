package co.exception;

public class Bank {
	double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		//balance += amount;
		balance =balance+amount;
	}

	public double withdraw(double amount) throws BankException {
		if (balance < 2000) {
			throw new BankException("balance can't be less than 2000");
		}
		if (amount > balance) {
			throw new BankException("Insufficient Balance " + "your withdraw amount is more than balance  ");
		}
		balance -= amount;
		return balance;
	}
}
