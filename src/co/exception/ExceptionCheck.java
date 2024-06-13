package co.exception;

public class ExceptionCheck {
public static void main(String[] args) {
	int a=22;
	int b=0;
	
	try {
		int c=a/b;
		System.out.println(c);
	} catch (Exception e) {
	e.printStackTrace();
	System.err.println(e.getMessage());	
	System.out.println("hello");
	}
}
}
