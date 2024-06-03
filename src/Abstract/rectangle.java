package Abstract;

public class rectangle extends Shape  {
private double length;
private double width;

//public double getLength() {
	//return length;
//}
//public double getWidth() {
	//return width;
//}
public rectangle(double length ,double width) {
	this.length=length;
	this.width=width;
}
@Override
public double area() {
	return length * width;
}

}
