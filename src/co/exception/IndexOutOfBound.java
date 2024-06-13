package co.exception;

public class IndexOutOfBound {
public static void main(String[] args) {
	String s = "Himanshi";
	//System.out.println(s.length());
	//System.out.println(s.charAt(9));
	try {
		System.out.println(s.length());
		System.out.println(s.charAt(9));
	}
	catch(StringIndexOutOfBoundsException e) {
		System.out.println("length choti hai");
	}
}
}
