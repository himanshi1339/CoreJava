package Abstract;

public class TriangleS extends ShapeS {
private int base;
private int height;

public TriangleS(int base ,int height, String color , String shapetype) {
	super (color , shapetype );
	this.base=base;
	this.height=height;
}
public int getBase() {
	return base ;
}
public int getHeight() {
	return height;
}
}
