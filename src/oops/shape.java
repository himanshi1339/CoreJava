package oops;

public class shape {
public double area() {
	return 0;
}
public static shape getShape (int i) {
	if (i==1) {
		return new rectangle (5,6);
	}
	if (i==2) {
		return new circle (4);
	}
	if (i==3) {
		return new triangle(10,30);
	}
	return new shape();
}
}
