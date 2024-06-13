package co.exception;

public class NullPointer {
public static void main(String[] args) {
	String name = null;
	//System.out.println(name.charAt(4)); (yaha pehle exception check kia )
	try {
	System.out.println(name.charAt(0));
	} catch (NullPointerException e) {
		System.out.println("nhai value khali hai");
	}
}
}
