package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BasicsSet {
public static void main(String[] args) {
	
	//set output always in randomorder
	Set s=new HashSet();
	s.add("zero");
	s.add("one");
	s.add("two");
	s.add("three");
	
	System.out.println(s);
	
	Iterator it= s.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
		it.remove();
	}
	System.out.println(s + "it.remove() remove all elements");
	System.out.println("-------");
	
	Set s2 = new HashSet();
	s2.add(40);
	s2.add(15);
	s2.add(1);
	s2.add(null);
	s2.add(null);
	
	System.out.println(s2);
	
	Iterator it1 = s2.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
}
}
