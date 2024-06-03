package oops;

public class rectangle extends shape {
private int length;
private int width;
 public rectangle() {
	 
 }
 public rectangle (int length, int width) {
	 this.length=length;
	 this.width=width;
 }
 public double area() {
	 return length*width;
 }
}
