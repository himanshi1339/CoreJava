package co.collection;

import java.util.Collection;
import java.util.ArrayList;

public class TestCollection {
public static void main(String[] args) {
	//creates a collection 
	Collection c= new ArrayList();
	
	//add elements into collection
	c.add("bura mt dekho");
	c.add("bura mt suno");
	c.add("bura mt kaho");
	
	System.out.println("Length of collection :" + c.size());
	System.out.println(c);
	//print all elements of collection 
	for (Object ele: c) {
		System.out.println(ele);
	}
	//convert collection into array
	Object[] oArray = c.toArray();
	
	//print all elements of array
	for(Object ele : oArray) {
		String s=(String) ele ;
		System.out.println(s);
	}
}
}
