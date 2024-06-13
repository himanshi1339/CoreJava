package in.co.java;

public class Method {
public static void SayHello() {
	for(int i=0 ; i<=5; i++ ) {
		System.out.println("hello");
	}
}
public static void SaySomething() {
	System.out.println("Hello Students");
}
public static void main(String[] args) {
	Method m= new Method();
	m.SayHello();
	m.SaySomething();
}
}

