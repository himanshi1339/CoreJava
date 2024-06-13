package sets;

import java.util.Enumeration;
import java.util.Vector;

public class Enumulation {
public static void main(String[] args) {
	Vector List = new Vector();
	List.addElement("Himanshi");
	List.addElement("raman");
	List.addElement("Megha");
	
	Enumeration a = List.elements();
	while (a.hasMoreElements()) {
		System.out.println(a.nextElement());
	}
}
}
