package sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
public static void main(String[] args) {
	
	
	HashSet s = new HashSet();
	s.add("hello");
	s.add("hii");
	s.add("bye");
	s.add("byee");
	System.out.println(s);
	System.out.println("------------");
	
	Iterator it = s.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
    HashSet s2 = new HashSet();
    s2.add(1);
    s2.add(2);
    s2.add(4);
    System.out.println("--------");
    System.out.println(s2);
    
    //System.out.println(s.contains(4));
    s2.remove(1);
    
    System.out.println(s.size());
    
    Iterator itr = s2.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    	
    	s.add("a");
    }
}
}
