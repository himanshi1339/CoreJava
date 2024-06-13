package co.exception;

public class GenericCatch {
public static void main(String[] args) {
	String name="vijay";
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(6));
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
