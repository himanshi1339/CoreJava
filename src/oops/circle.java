package oops;

public class circle extends shape  {
private double radius;
public circle() {
	
}

public circle (int radius) {
this.radius =radius;	
}
public double area() {
	return 3.14 * radius * radius ;
	
}

}