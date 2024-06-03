package oops;

public class triangle  extends shape {
private int base ;
private int height;

public triangle() {
	
}
public triangle (int base , int height) {
	this.base=base;
	this.height=height;
}
public double area() {
	return base*height;
}
}
