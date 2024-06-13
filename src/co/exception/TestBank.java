package co.exception;

public class TestBank {
public static void main(String[] args) {
	Bank b=new Bank();
	b.setBalance(1000);
	b.deposit(400);
	
	try {
		b.withdraw(1000);
		System.out.println(b.getBalance());
	}
	catch(BankException e) {
		System.out.println(e.getMessage());
	}
}
}
