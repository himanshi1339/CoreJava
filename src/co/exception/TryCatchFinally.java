package co.exception;

public class TryCatchFinally {
public static void main(String[] args) {
	String name="himanshi";
	try {
		System.out.println(name.charAt(9));
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("String choti hai");
	}catch(NullPointerException e) {
		System.out.println(e.getMessage());
	}finally {
		System.out.println("i am always executed");
	}
}
}
