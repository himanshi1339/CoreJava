package co.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestingCollection {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("Himanshi");
		c.add("Sharma");
		c.add(10);
		c.add(10.20);
		System.out.println(c);
	}

}
