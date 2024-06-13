package sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {
public static void main(String[] args) { 
	  LinkedHashSet s = new LinkedHashSet();
	  s.add("welcome");
	  s.add("to");
	  s.add("geeks");
	  s.add("4");
	  s.add("geeks");
	  System.out.println(s);
	  
	  Iterator it = s.iterator();
	  
	 
	  while (it.hasNext()) {
		  System.out.println(it.next());
	  }
}
}
