package in.co.java;

public class beforeafter {
public static void main(String[] args) {
	
	//before swapping
	int a=10;
	int b=20;
	System.out.println("before swapping");
	System.out.println("a=" + a);
	System.out.println("b=" +b);
	
	//after swapping
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swapping");
	System.out.println(a);
	System.out.println(b);
	
}
}
