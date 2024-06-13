package co.exception;

public class UsingArray {
public static void main(String[] args) {
	String s[]= {"raman"};
	//System.out.println(s.length);
	//System.out.println(s[23]);
	
	try {
		System.out.println(s.length);
		System.out.println(s[11]);
	}catch(ArrayIndexOutOfBoundsException e) {
		//System.out.println(e.getMessage());
		System.err.println(e.getMessage());
	}
}
}
