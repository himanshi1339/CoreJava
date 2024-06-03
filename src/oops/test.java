package oops;

public class test {
public static void main(String[] args) {
	shape s1 =shape.getShape(1);
	shape s2=shape.getShape(2);
	shape s3=shape.getShape(3);
	
	System.out.println("area of a rectang =" + s1.area());
	System.out.println("area of a circle =" + s2.area());
	System.out.println("area of a triangle =" + s3.area());
}
}
