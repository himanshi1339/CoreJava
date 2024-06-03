package Abstract;

public class TextS {
public static void main(String[] args) {
	TriangleS t = new TriangleS(33 , 2 , "blue" , "square");
	CircleS c = new CircleS(22 , "pink" , "circle");
	System.out.println(t.getBase());
	System.out.println(t.getColour());
	System.out.println(t.getHeight());
	System.out.println(t.getShapetype());
	System.out.println(c.getRadius());
}
}
