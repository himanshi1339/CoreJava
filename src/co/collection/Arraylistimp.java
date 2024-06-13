package co.collection;

import java.util.ArrayList;

public class Arraylistimp {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("himanshi");
		a.add("sharma");
		a.add("indore");
		a.add("hello");
		Integer i=new Integer(4);
		a.add(i);
		Integer  value= (Integer)a.get(3);
		System.out.println("index#3 value="+value);
	}

}
