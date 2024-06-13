package co.exception;

public class MultipleCatch {
public static void main(String[] args) {
	String name="Himanshi";
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(4));
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("String abhi choti hai");
	}catch(RuntimeException e) {
		System.out.println("Sundar sa naam nhi hai");
	}finally {
		System.out.println("Pandit hu me");
	}
}
}
