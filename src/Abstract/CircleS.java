package Abstract;

public class CircleS extends ShapeS {
private int radius ;

public CircleS(int radius , String color , String shapetype) {
	super (color , shapetype);
	this.radius=radius;
}
public int getRadius() {
	return radius;
}
}
