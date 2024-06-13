package oops;

public class Account {
private int accountno;
private String accounttype;
private int balance;
public int getAccountno() {
	return accountno;
}
public void setAccountno(int accountno) {
	this.accountno = accountno;
}
public String getAccounttype() {
	return accounttype;
}
public void setAccounttype(String accounttype) {
	this.accounttype = accounttype;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public void deposit(double amount) {
	if (amount>200) {
		//balance =(int) (balance + amount) ;
		balance +=amount;
		System.out.println("deposit successful. new balance :" + balance);
	}else {
		System.out.println("invalid diposit ammount");
	}
}
public void withdraw(double amount) {
	if(amount>0 && amount<=balance) {
		//balance = (int) (balance-amount);
		balance -=amount;
		System.out.println("withdraw successful. new balance :" +balance);
	}else {
		System.out.println("invalid withdrawal amount or insufficient balance.");
	}
}
public static void main(String[] args) {
	Account a=new Account();
	a.accountno=233434324;
	a.accounttype="saving";
	a.balance=200000;
	a.deposit(3000);
	a.withdraw(5000);
	System.out.println("Accountno"+"="+a.accountno);
	System.out.println(a.accounttype);
	System.out.println(a.balance);
	System.out.println();
}

}
