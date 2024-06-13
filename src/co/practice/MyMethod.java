package co.practice;

public class MyMethod {
public MyMethod() {
	System.out.println("himanshi");
}
public MyMethod(int a , int b) {
	this();
	int c = a+b;
	System.out.println(c);
	
}
public MyMethod (int a,int b,int c) {
	this(4,3);
	int d =a+b+c;
	System.out.println(d);
			
}public static void main(String[] args) {
	MyMethod m= new MyMethod(2, 3,3);
	
	
	
}
}
