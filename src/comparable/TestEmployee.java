package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
public static void main(String[] args) {
	List l = new ArrayList();
	l.add(new Employee (2 , "a" , 3000));
	l.add(new Employee (4 , "c" , 2000));
	l.add(new Employee (3 , "b" , 1000));
	l.add(new Employee (1 , "e" , 4000));
	
	 Collections.sort(l);
	for (Object object : l) {
		System.out.println(object);
	}
	
}
}
