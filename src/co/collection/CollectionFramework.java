package co.collection;

import java.util.ArrayList;

public class CollectionFramework {
public static void main(String[] args) {
	ArrayList names=new ArrayList();
	for (int i=0;i<10;i++) {
		names.add("NO #" + i);
	}
	System.out.println("Names =" +names.size());
	Object o=names.get(0);
	String name=(String)o;
	System.out.println("First Name is" + name);
}
}
